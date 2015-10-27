package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_viewModelMatch;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_viewModel pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Element_viewModelProcessor implements IMatchProcessor<Element_viewModelMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTelecareSystem the value of pattern parameter telecareSystem in the currently processed match
   * 
   */
  public abstract void process(final TelecareSystem pTelecareSystem);
  
  @Override
  public void process(final Element_viewModelMatch match) {
    process(match.getTelecareSystem());
  }
}
