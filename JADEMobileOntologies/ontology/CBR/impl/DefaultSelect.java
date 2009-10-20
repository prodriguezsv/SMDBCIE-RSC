package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: Select
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultSelect implements Select, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultSelect() {
    this._internalInstanceName = "";
  }

  public DefaultSelect(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: to
   */
   private Problem to;
   public void setTo(Problem value) { 
    this.to=value;
   }
   public Problem getTo() {
     return this.to;
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
   * Protege name: successfulConflictSet
   */
   private List successfulConflictSet = new ArrayList();
   public void addSuccessfulConflictSet(Hypothesis elem) { 
     successfulConflictSet.add(elem);
   }
   public boolean removeSuccessfulConflictSet(Hypothesis elem) {
     boolean result = successfulConflictSet.remove(elem);
     return result;
   }
   public void clearAllSuccessfulConflictSet() {
     successfulConflictSet.clear();
   }
   public Iterator getAllSuccessfulConflictSet() {return successfulConflictSet.iterator(); }
   public List getSuccessfulConflictSet() {return successfulConflictSet; }
   public void setSuccessfulConflictSet(List l) {successfulConflictSet = l; }

   /**
   * Protege name: failureConflictSet
   */
   private List failureConflictSet = new ArrayList();
   public void addFailureConflictSet(Hypothesis elem) { 
     failureConflictSet.add(elem);
   }
   public boolean removeFailureConflictSet(Hypothesis elem) {
     boolean result = failureConflictSet.remove(elem);
     return result;
   }
   public void clearAllFailureConflictSet() {
     failureConflictSet.clear();
   }
   public Iterator getAllFailureConflictSet() {return failureConflictSet.iterator(); }
   public List getFailureConflictSet() {return failureConflictSet; }
   public void setFailureConflictSet(List l) {failureConflictSet = l; }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      abs.set(CBRTerminologyOntology.SELECT_TO, (AbsTerm) onto.fromObject(getTo()));
      abs.set(CBRTerminologyOntology.SELECT_PROBLEM, (AbsTerm) onto.fromObject(getProblem()));
      abs.set(CBRTerminologyOntology.SELECT_SUCCESSFULCONFLICTSET, (AbsTerm) onto.fromObject(getSuccessfulConflictSet()));
      abs.set(CBRTerminologyOntology.SELECT_FAILURECONFLICTSET, (AbsTerm) onto.fromObject(getFailureConflictSet()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Select");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      to = (Problem)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SELECT_TO));
      problem = (Problem)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SELECT_PROBLEM));
      successfulConflictSet = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SELECT_SUCCESSFULCONFLICTSET));
      failureConflictSet = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SELECT_FAILURECONFLICTSET));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Select");
     }
   }

}
