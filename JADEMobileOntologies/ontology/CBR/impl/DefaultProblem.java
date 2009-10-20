package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: Problem
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultProblem implements Problem, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultProblem() {
    this._internalInstanceName = "";
  }

  public DefaultProblem(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: goalRank
   */
   private String goalRank;
   public void setGoalRank(String value) { 
    this.goalRank=value;
   }
   public String getGoalRank() {
     return this.goalRank;
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
   * Protege name: leastSimilarityDegree
   */
   private String leastSimilarityDegree;
   public void setLeastSimilarityDegree(String value) { 
    this.leastSimilarityDegree=value;
   }
   public String getLeastSimilarityDegree() {
     return this.leastSimilarityDegree;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.PROBLEM_GOALRANK, (AbsTerm) onto.fromObject(getGoalRank()));
      abs.set(CBRTerminologyOntology.PROBLEM_DESCRIPTION, (AbsTerm) onto.fromObject(getDescription()));
      abs.set(CBRTerminologyOntology.PROBLEM_LEASTSIMILARITYDEGREE, (AbsTerm) onto.fromObject(getLeastSimilarityDegree()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Problem");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      goalRank = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.PROBLEM_GOALRANK));
      description = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.PROBLEM_DESCRIPTION));
      leastSimilarityDegree = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.PROBLEM_LEASTSIMILARITYDEGREE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Problem");
     }
   }

}
