package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: Case
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultCase implements Case, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultCase() {
    this._internalInstanceName = "";
  }

  public DefaultCase(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: problem
   */
   private Problem problem;
   public void setProblem(Problem value) { 
    this.problem=value;
   }
   public Problem getProblem() {
     return this.problem;
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
   * Protege name: solution
   */
   private Solution solution;
   public void setSolution(Solution value) { 
    this.solution=value;
   }
   public Solution getSolution() {
     return this.solution;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.CASE_PROBLEM, (AbsTerm) onto.fromObject(getProblem()));
      abs.set(CBRTerminologyOntology.CASE_STATE, state);
      abs.set(CBRTerminologyOntology.CASE_SOLUTION, (AbsTerm) onto.fromObject(getSolution()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Case");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      problem = (Problem)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.CASE_PROBLEM));
      state = abs.getBoolean(CBRTerminologyOntology.CASE_STATE);
      solution = (Solution)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.CASE_SOLUTION));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Case");
     }
   }

}
