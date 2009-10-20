package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: PossibleSolution
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultPossibleSolution implements PossibleSolution, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultPossibleSolution() {
    this._internalInstanceName = "";
  }

  public DefaultPossibleSolution(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: unconfirmedDescription
   */
   private Description unconfirmedDescription;
   public void setUnconfirmedDescription(Description value) { 
    this.unconfirmedDescription=value;
   }
   public Description getUnconfirmedDescription() {
     return this.unconfirmedDescription;
   }

   /**
   * Protege name: points
   */
   private float points;
   public void setPoints(float value) { 
    this.points=value;
   }
   public float getPoints() {
     return this.points;
   }

   /**
   * Protege name: doubtfulDescription
   */
   private Description doubtfulDescription;
   public void setDoubtfulDescription(Description value) { 
    this.doubtfulDescription=value;
   }
   public Description getDoubtfulDescription() {
     return this.doubtfulDescription;
   }

   /**
   * Protege name: solutionDescription
   */
   private Description solutionDescription;
   public void setSolutionDescription(Description value) { 
    this.solutionDescription=value;
   }
   public Description getSolutionDescription() {
     return this.solutionDescription;
   }

   /**
   * Protege name: confirmedDescription
   */
   private Description confirmedDescription;
   public void setConfirmedDescription(Description value) { 
    this.confirmedDescription=value;
   }
   public Description getConfirmedDescription() {
     return this.confirmedDescription;
   }

   /**
   * Protege name: possibleSolution
   */
   private Object possibleSolution;
   public void setPossibleSolution(Object value) { 
    this.possibleSolution=value;
   }
   public Object getPossibleSolution() {
     return this.possibleSolution;
   }

   /**
   * Protege name: contradictions
   */
   private Description contradictions;
   public void setContradictions(Description value) { 
    this.contradictions=value;
   }
   public Description getContradictions() {
     return this.contradictions;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.POSSIBLESOLUTION_UNCONFIRMEDDESCRIPTION, (AbsTerm) onto.fromObject(getUnconfirmedDescription()));
      abs.set(CBRTerminologyOntology.POSSIBLESOLUTION_POINTS, points);
      abs.set(CBRTerminologyOntology.POSSIBLESOLUTION_DOUBTFULDESCRIPTION, (AbsTerm) onto.fromObject(getDoubtfulDescription()));
      abs.set(CBRTerminologyOntology.POSSIBLESOLUTION_SOLUTIONDESCRIPTION, (AbsTerm) onto.fromObject(getSolutionDescription()));
      abs.set(CBRTerminologyOntology.POSSIBLESOLUTION_CONFIRMEDDESCRIPTION, (AbsTerm) onto.fromObject(getConfirmedDescription()));
      abs.set(CBRTerminologyOntology.POSSIBLESOLUTION_POSSIBLESOLUTION, (AbsTerm) onto.fromObject(getPossibleSolution()));
      abs.set(CBRTerminologyOntology.POSSIBLESOLUTION_CONTRADICTIONS, (AbsTerm) onto.fromObject(getContradictions()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising PossibleSolution");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      unconfirmedDescription = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.POSSIBLESOLUTION_UNCONFIRMEDDESCRIPTION));
      points = abs.getFloat(CBRTerminologyOntology.POSSIBLESOLUTION_POINTS);
      doubtfulDescription = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.POSSIBLESOLUTION_DOUBTFULDESCRIPTION));
      solutionDescription = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.POSSIBLESOLUTION_SOLUTIONDESCRIPTION));
      confirmedDescription = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.POSSIBLESOLUTION_CONFIRMEDDESCRIPTION));
      possibleSolution = (Object)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.POSSIBLESOLUTION_POSSIBLESOLUTION));
      contradictions = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.POSSIBLESOLUTION_CONTRADICTIONS));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising PossibleSolution");
     }
   }

}
