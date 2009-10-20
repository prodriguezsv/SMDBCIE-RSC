package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: Resolve
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultResolve implements Resolve, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultResolve() {
    this._internalInstanceName = "";
  }

  public DefaultResolve(String instance_name) {
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      abs.set(CBRTerminologyOntology.RESOLVE_PROBLEM, (AbsTerm) onto.fromObject(getProblem()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Resolve");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      problem = (Problem)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.RESOLVE_PROBLEM));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Resolve");
     }
   }

}
