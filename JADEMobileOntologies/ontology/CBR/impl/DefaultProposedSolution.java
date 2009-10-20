package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: ProposedSolution
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultProposedSolution implements ProposedSolution, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultProposedSolution() {
    this._internalInstanceName = "";
  }

  public DefaultProposedSolution(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: state
   */
   private boolean state;
   public void setState(boolean value) { 
    this.state=value;
   }
   public boolean getState() {
     return this.state;
   }

   /**
   * Protege name: evaluatedSolution
   */
   private PossibleSolution evaluatedSolution;
   public void setEvaluatedSolution(PossibleSolution value) { 
    this.evaluatedSolution=value;
   }
   public PossibleSolution getEvaluatedSolution() {
     return this.evaluatedSolution;
   }

   /**
   * Protege name: certaintyDegree
   */
   private String certaintyDegree;
   public void setCertaintyDegree(String value) { 
    this.certaintyDegree=value;
   }
   public String getCertaintyDegree() {
     return this.certaintyDegree;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.PROPOSEDSOLUTION_STATE, state);
      abs.set(CBRTerminologyOntology.PROPOSEDSOLUTION_EVALUATEDSOLUTION, (AbsTerm) onto.fromObject(getEvaluatedSolution()));
      abs.set(CBRTerminologyOntology.PROPOSEDSOLUTION_CERTAINTYDEGREE, (AbsTerm) onto.fromObject(getCertaintyDegree()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising ProposedSolution");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      state = abs.getBoolean(CBRTerminologyOntology.PROPOSEDSOLUTION_STATE);
      evaluatedSolution = (PossibleSolution)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.PROPOSEDSOLUTION_EVALUATEDSOLUTION));
      certaintyDegree = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.PROPOSEDSOLUTION_CERTAINTYDEGREE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising ProposedSolution");
     }
   }

}
