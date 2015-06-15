# iq-sirius-integration
IncQuery integration into Sirius

## Telepítési útmutató
 * Eclipse Modeling Tools letöltése (http://www.eclipse.org/downloads/)
 * az _Eclipse Marketplace-ből_ telepítsük az alábbiakat (elképzelhető, hogy a lentiektől eltérő verzióval is működni fog az eszköz, viszont tesztelve ezekkel volt)
  * _EMF-IncQuery 0.9.1_
  * _Sirius 2.0_
 * Git repository klónozása
 * a _host_ mappában lévő projekteket importáljuk be a host-eclipsebe
 * a szükséges részeket generáljuk le:
  * _org.eclipse.incquery.viewmodel/model/traceability.genmodel->Generate model code_
  * előfordulhat, hogy az egyes projektekben található IncQuery mintákhoz nem generálódnak le automatikusan a szükséges osztályok (Match, Matcher, stb.). Ezt úgy tudjuk orvosolni, hogy az alább felsorolt csomagokban található _.eiq_ fájlokat megnyitjuk, módosítunk bennük valamit (természetesen úgy, hogy ezzel ne tegyünk kárt a már meglévő mintákban), majd mentünk. Ekkor biztosan legenerálódnak a szükséges fájlok.
   * _hu.bme.mit.inf.dipterv1.incquery/src/hu.bme.mit.inf.dipterv1.incquery.patterns/_ csomagban található fájlok
   * _hu.bme.mit.inf.sirius.interpreter.incquery/src/hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns_ csomagban található fájlok
   * _org.eclipse.incquery.viewmodel/src/org.eclipse.incquery.viewmodel.traceability.patterns_ csomagban található fájlok
 * hozzunk létre egy új _Run configuration-t_ (Eclipse Application típusút, az alapbeállítások jók lesznek)
 * indítsuk el a _Runtime Eclipse-et_
 * importáljuk be a repository _runtime_ mappájában található projekteket
 * váltsunk _Modeling_ perspektívára
 * példánymodelleket az alábbi projektekben találhatunk
  * _hu.bme.mit.inf.eclipsecon.sample_
  * _hu.bme.mit.inf.socialnetwork.base.sample_
 
## Használati útmutató
Először bemutatnám a _host eclipse-ben_ található, a használat szempontjából fontos projekteket:
 * _hu.bme.mit.inf.dipterv1.models_: ez a projekt tartalmazza a transzformáció során használt metamodelleket (_model mappa_). A demó során ezek közül a _socialnetwork_base_ valamint a _socialnetwork_many_one_ metamodellekre lesz szükség.

  * A _socialnetwork_base_ metamodell: családfák létrehozását teszi lehetővé. A modellben lehetnek férfiak (_Man_) illetve nők (_Woman_) valamint köztük definiálhatunk szülő-gyermek (_children_) valamint baráti (_friends_) kapcsolatokat. Az egyes emberek rendelkeznek továbbá néhány tulajdonsággal is: keresztnév (_firstName_), vezetéknév (_lastName_), kor (_age_), stb.

  * A _socialnetwork_many_one_ metamodell: családok, valamint a köztük lévő baráti kapcsolatok leírására alkalmas. A család (_Family_) rendelkezik továbbá egy név (_name_) tulajdonsággal.

 * _hu.bme.mit.inf.dipterv1.incquery_: ez a projekt tartalmazza a transzformáció során használható minták definícióit. A minták segítségével transzformációkat írhatunk le a _socialnetwork_base_ típusú valamint _socialnetwork_many_one/one_many/stb_ típusú modellek között. A minták attól függően lettek csoportosítva egy-egy fájlba, hogy a transzformáció során mely metamodell szerinti modell jön létre. Így például a demóban bemutatott több-egy leképzéshez szükséges minták a _patterns_many_one.eiq_ fájlban kaptak helyet. Ebből a fájlból két mintát emelnék ki:
  * _family_: ennek a segítségével találhatóak meg az egyes családok a forrás példánymodellben
  * _friend_: ennek a segítségével találhatóak meg a baráti kapcsolatok egy-egy család között
  * _FONTOS: MINDEN OLYAN MINTÁT, AMIT A SIRIUS-OS FELÜLET DEFINIÁLÁSA SORÁN FEL SZERETNÉNK HASZNÁLNI, AZT EBBEN A PROJEKTBEN KELL DEFINIÁLNI. A HASZNÁLNI KÍVÁNT MINTÁT A FENTIEK ALAPJÁN HELYEZZÜK EL EGY MEGFELELŐ .eiq FÁJLBA; ÜGYELJÜNK RÁ, HOGY A LÉTREHOZOTT MINTÁKNAK PUBLIKUSNAK KELL LENNIÜK!_

A következőkben a _runtime eclipse-ben_ található fontosabb projekteket ismertetem:
 * _hu.bme.mit.inf.socialnetwork.base.design_: ez a projekt tartalmazza a transzformáció bemeneteként szolgáló modell szerkesztéséhez és megjelenítéséhez használható _Sirius-os_ felület definícióját.

 * _hu.bme.mit.inf.socialnetwork.manyone.design_: ez a projekt tartalmazza a transzformáció eredményeként létrejövő modell megjelenítéséhez használható _Sirius-os_ felület definícióját (_/description/socialnetwork_manyone.odesign_). A fájlt megnyitva a _Social Network Many-One Diagram_ elem tulajdonságainál (_Properties View_) az _Advanced_ fülön láthatunk egy _Root Expression_ mezőt. Az itt látható kifejezés (_incquery:init[packageNS=http://hu.bme.mit.inf.models/socialnetwork_many_one]_) egy speciális inicializáló utasítás, melynek hatására a diagram megnyitásakor inicializálódnak a transzformációk elvégzéséhez szükséges eszközök. A _packageNS_ paraméter a transzformáció során létrejövő modell (ún. nézeti modell) struktúráját definiáló metamodell _namespace URI-át_ kapja meg értékül. A fájl többi részében a leképzések találhatóak (_Family elem, Friend él_). A _Family_ elem tulajdonságait megvizsgálva a _General_ fülön láthatjuk a _Semantic Candidates Expression_ mezőben a _incquery:hu.bme.mit.inf.dipterv1.incquery.patterns.family_ kifejezést. Ez azt a működést produkálja, hogy a megadott _FQN-el_ rendelkező minta minden egyes illeszkedéséhez létrejön egy-egy _Family_ elem a nézeti modellben, mely meg is jelenik a felületen (a létrehozott elem tulajdonságai nem kerülnek kitöltésre, így a példa esetén a család neve sem lesz megadva a létrejött elemeknél). Természetesen minden egyes illeszkedés eltünésekor a megfelelő elem törlődik a nézeti modellből és így a felületről is. A _Friend_ elem segítségével élet tudunk létrehozni két _Family_ elem között a nézeten. A tulajdonságait megvizsgálva a _General_ fülön láthatjuk a _Target Finder Expression_ mezőben a _incquery:hu.bme.mit.inf.dipterv1.incquery.patterns.friend[ref=friends]_ kifejezést. Ez azt a működést produkálja, hogy a megadott _FQN-el_ rendelkező minta minden egyes illeszkedése esetén behúz egy-egy élet a megfelelő _Family_ elemek között (ha megvizsgáljuk a _family_ mintát láthatjuk, hogy a forrásmodellben egy családot egy-egy olyan férfi-nő párossal azonosítunk, akiknek van közös gyerekük és nincsenek őseik; a _friend_ minta összesen négy paramétert ad: két férfi-nő párost, vagyis két családot; ha a _friend_ minta illeszkedik, annak első két paramétere az él kiindulópontjaként szolgáló családot reprezentálja, míg a második két paraméter az él végpontjaként szolgáló családot reprezentálja). Megkötés az élekhez tartozó minták esetén, hogy a minta paramétereit az alábbiak szerint kell megadni: <forrás elemhez tartozó minta paraméterei>, <cél elemhez tartozó minta paraméterei> (a _friend_ minta esetén az él mindkét végén _Family_ elem volt, így a _family_ minta paramétereit kellett megadnunk kétszer egymás után).

 * _hu.bme.mit.inf.eclipsecon.sample_: ez a projekt tartalmaz egy példát a működés bemutatásáhot. _Modeling_ perspektívában megnyitva a projektet találunk egy _sample.socialnetwork_base_ fájlt, melyet "lenyitva" a _Social Nwtwork_ elem alatt találunk két diagrammot: _new Social Network Base Diagram_, _new Social Network Many-One Diagram_. Előbbit megnyitva a transzformáció bemeneteként szolgáló modellt láthatjuk, míg utóbbit megnyitva a transzformáció során létrejövő nézeti modellt tekinthetjük meg. _FONTOS: AZ ESZKÖZ MÉG NEM VÉGLEGES, TARTALMAZHAT HIBÁKAT. A FORRÁSMODELL MÓDOSÍTÁSA A FELÜLETEN DEFINIÁLT ESZKÖZÖKKEL LEHETSÉGES, A MÓDOSÍTÁSOK HATÁSÁRA -AMENNYIBEN SZÜKSÉGES- AUTOMATIKUSAN MÓDOSUL A HOZZÁ TARTOZÓ NÉZETI MODELL IS. NEM MŰKÖDIK VISZONT MEGFELELŐEN A VISSZAVONÁS MŰVELET (CTRL+Z), EZT NEM AJÁNLOTT HASZNÁLNI. BEMUTATHATÓ FUNKCIÓK: BÁRMELYIK PIROS (BARÁT) ÉL KITÖRLÉSÉVEL MEGSZŰNIK A BARÁTI KAPCSOLAT A MEGFELELŐ NÉZETIMODELLBELI ELEMEK KÖZÖTT (ÉS PERSZE FORDÍTVA). BÁRMELYIK SZÜLŐ KITÖRLÉSE A CSALÁD "MEGSZŰNÉSÉT" VONJA MAGA UTÁN (TERMÉSZETESEN HA ÚJ CSALÁDOT VESZÜNK FEL AZ IS AUTOMATIKUSAN MEGJELENIK)._
