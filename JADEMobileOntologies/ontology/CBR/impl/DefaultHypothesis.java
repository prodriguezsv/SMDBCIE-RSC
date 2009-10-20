package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: Hypothesis
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultHypothesis implements Hypothesis, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultHypothesis() {
    this._internalInstanceName = "";
  }

  public DefaultHypothesis(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: justification
   */
   private Description justification;
   public void setJustification(Description value) { 
    this.justification=value;
   }
   public Description getJustification() {
     return this.justification;
   }

   /**
   * Protege name: description
   */
   private Description description;
   public void setDescription(Description value) { 
    this.description=value;
   }
   public Description getDescription() {
     return this.description;
   }

   /**
   * Protege name: possibleSolutions
   */
   private List possibleSolutions = new ArrayList();
   public void addPossibleSolutions(PossibleSolution elem) { 
     possibleSolutions.add(elem);
   }
   public boolean removePossibleSolutions(PossibleSolution elem) {
     boolean result = possibleSolutions.remove(elem);
     return result;
   }
   public void clearAllPossibleSolutions() {
     possibleSolutions.clear();
   }
   public Iterator getAllPossibleSolutions() {return possibleSolutions.iterator(); }
   public List getPossibleSolutions() {return possibleSolutions; }
   public void setPossibleSolutions(List l) {possibleSolutions = l; }

   /**
   * Protege name: unmatchedDescription
   */
   private Description unmatchedDescription;
   public void setUnmatchedDescription(Description value) { 
    this.unmatchedDescription=value;
   }
   public Description getUnmatchedDescription() {
     return this.unmatchedDescription;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.HYPOTHESIS_JUSTIFICATION, (AbsTerm) onto.fromObject(getJustification()));
      abs.set(CBRTerminologyOntology.HYPOTHESIS_DESCRIPTION, (AbsTerm) onto.fromObject(getDescription()));
      abs.set(CBRTerminologyOntology.HYPOTHESIS_POSSIBLESOLUTIONS, (AbsTerm) onto.fromObject(getPossibleSolutions()));
      abs.set(CBRTerminologyOntology.HYPOTHESIS_UNMATCHEDDESCRIPTION, (AbsTerm) onto.fromObject(getUnmatchedDescription()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Hypothesis");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      justification = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.HYPOTHESIS_JUSTIFICATION));
      description = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.HYPOTHESIS_DESCRIPTION));
      possibleSolutions = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.HYPOTHESIS_POSSIBLESOLUTIONS));
      unmatchedDescription = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.HYPOTHESIS_UNMATCHEDDESCRIPTION));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Hypothesis");
     }
   }

}
