# iq-sirius-integration
IncQuery integration into Sirius

## Installation guide
 * Download the Eclipse Modeling Tools Luna-SR2 release (http://www.eclipse.org/downloads/ ; it's possible that the tool will work with other Eclipse releases, but it was only tested with the above mentioned release)
 * From the _Eclipse Marketplace_ install the followings (it's possible that the tool will work with other versions, but it was only tested with these)
  * _EMF-IncQuery 0.9.1_
  * _Sirius 2.0_
 * Clone the Git repository
 * Import the projects from the _host_ directory into the _host-eclipse_
 * Generate the followings:
  * _org.eclipse.incquery.viewmodel/model/traceability.genmodel->Generate model code_
  * It can happen, that for some _IncQuery_ patterns the needed classes (_Match, Matcher, etc._) won't be generated autmatically. In this case, you have to open the following _.eiq_ files, modify them in a "not harmful" way (e.g. insert and delete a _space_ character), and after that save the files. These steps ensure that the needed files will be generated.
    * The _.eiq_ files in the _hu.bme.mit.inf.dipterv1.incquery/src/hu.bme.mit.inf.dipterv1.incquery.patterns/_ package
    * The _.eiq_ files in the _hu.bme.mit.inf.sirius.interpreter.incquery/src/hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns_ package
    * The _.eiq_ files in the _org.eclipse.incquery.viewmodel/src/org.eclipse.incquery.viewmodel.traceability.patterns_ package
 * Create a new _Run configuration_ (type: _Eclipse Application_, the default settings will be fine)
 * Run the _Runtime Eclipse_
 * Import the projects from the _runtime_ directory into the _runtime-eclipse_
 * Switch to _Modeling perspective_
 * You can find some instance model in the following projects
  * _hu.bme.mit.inf.eclipsecon.sample_
  * _hu.bme.mit.inf.socialnetwork.base.sample_

## User guide
First of all I would like to describe some projects in the _host-eclipse_, which are important in aspect of usage:
 * _hu.bme.mit.inf.dipterv1.models_: this project contains the metamodels which are used during the transformation (_model directory_). For the demo we will use the _socialnetwork_base_ and _socialnetwork_many_one_ metamodels.

  * The _socialnetwork_base_ metamodel: with this metamodel we can describe "family trees". In the instance model we can create _Man_ or _Woman_ elements, and  we can define "parent-child" relationship (_children reference_) and "friend" relationship (_friends reference_) between them. Every person has some further attribute: first name (_firstName attribute_), last name (_lastName attribute_), age (_age attribute_), etc.

  * The _socialnetwork_many_one_ metamodel: with this metamodel we can describe families, and "friend" relationship between them. The _Family_ element has a _name attribute_ too.

 * _hu.bme.mit.inf.dipterv1.incquery_: this project contains the _IncQuery patterns_ that are used during the transformation. With these patterns we can define transformations between the _socialnetwork_base_-type and _socialnetwork_many_one/one_many/etc_-type models. The patterns were grouped into the same file depending on the transformation. For example if the patterns are used to create a model with the _social_network_many_one_ metamodel, then the patterns will be found in the _patterns_many_one.eiq_ file (we'll use these patterns in the example: see _hu.bme.mit.inf.eclipsecon.sample_ project). From this file, I would like to highlight two patterns:
  * _family_: we can find the "families" in the source instance model with this pattern
  * _friend_: we can find the "friend relationships" between the families with this pattern
  * _IMPORTANT: EVERY PATTERN, THAT WE WANT TO USE FOR DEFINING A SIRIUS-BASED EDITOR HAVE TO BE DEFINED IN THIS PROJECT. THESE PATTERNS HAVE TO BE PLACED INTO A SUITABLE .eiq FILE LIKE I DESCRIBED ABOVE. THE USED PATTERNS MUST BE PUBLIC!_

In the followings, I will describe some project in the _runtime eclipse_:
 * _hu.bme.mit.inf.socialnetwork.base.design_: this project contains the definition of the Sirius-based editor for the source model.

 * _hu.bme.mit.inf.socialnetwork.manyone.design_: this project contains the definition (_/description/socialnetwork_manyone.odesign_) of the Sirius-based editor for the target model (or _view model_) of the transformation. If you open the _.odesign_ file, at the properties of the _Social Network Many-One Diagram_ element (_Properties View_) on the _Advanced_ tab you will see a field, called _Root Expression_. The expression, that you can see here (_incquery:init[packageNS=http://hu.bme.mit.inf.models/socialnetwork_many_one]_) is a special initialization instruction, which makes the inicialization of the tools for the transformation when the diagram opens. The _packageNS_ parameter is used to set that metamodel's _namespace URI_, which belongs to the target (or _view_) model created during the transformation. In the other parts of the file you can find the mappings (_Family element, Friend edge_). At the properties of the _Family_ element on the _General_ tab you can see a _Semantic Candidates Expression_ field with this expression: _incquery:hu.bme.mit.inf.dipterv1.incquery.patterns.family_. Because of this expression, the tool will create a _Family_ element (the type of the created element is set in the _Domain class field_) in the _view model_ for every match of the pattern with the given _FQN_. The created elements will be displayed in the editor (the properties of the created elements won't be set, so in this example the name of the family (_name attribute_) will be empty). Of course, every time, when a match disappears, the corresponding _Family_ element will be deleted from the _view model_. With the _Friend_ element, we can create edges between two _Family_ element. If you open the properties of it, on the _General_ tab you will see a _Target Finder Expression_ field, with this expression: _incquery:hu.bme.mit.inf.dipterv1.incquery.patterns.friend[ref=friends]_. Because of this expression, the tool will create an edge (set the _friends relation_) between the corresponding _Family_ elements for every match of the pattern with the given _FQN_ (if you examine the _family_ pattern, you can see that a family is identified by a man-woman pair, who have at least one common child, and don't have any ancestors; the _friend_ pattern gives four parameters: two man-woman pairs (families); if the _friend_ pattern matches, the first two parameter represents the family, from which the edge starts, while the second two parameters represents the family where the edge ends). For those patterns, which belongs to edges (in this example the _friend pattern_) you have to define the parameters as follows: _parameters of the source element's pattern, parameters of the target element's pattern_ (in this example on both ends of the edge we have a _Family_ element, so we created the _friend_ pattern with the parameters: _family pattern's parameters, family pattern's parameters_).

 * _hu.bme.mit.inf.eclipsecon.sample_: this project contains an example for the demonstration. If you open this project in _Modeling perspective_ you will see a _sample.socialnetwork_base_ file (this is a sample source instance model). If you open this model, under the _Social Network_ element you will find two diagrams: _new Social Network Base Diagram_, _new Social Network Many-One Diagram_. If you open the former, you will see the source model of the transformation, while if you open the second one, you will see the _view model_ created by the transformation.
 * _IMPORTANT: THIS IS A BETA VERSION OF THE TOOL, SO IT CAN CONTAIN BUGS. THE MODIFICATION OF THE SOURCE MODEL WITH THE GIVEN TOOLS IN THE EDITOR IS POSSIBLE, THE CORRESPONDING VIEW MODEL WILL BE AUTOMATICALLY MODIFIED. THE UNDO OPERATION DOES NOT WORK PROPERLY, USING IT IS NOT RECOMMENDED._
