package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: Solution
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultSolution implements Solution, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultSolution() {
    this._internalInstanceName = "";
  }

  public DefaultSolution(String instance_name) {
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
   * Protege name: name
   */
   private String name;
   public void setName(String value) { 
    this.name=value;
   }
   public String getName() {
     return this.name;
   }

   /**
   * Protege name: rank
   */
   private String rank;
   public void setRank(String value) { 
    this.rank=value;
   }
   public String getRank() {
     return this.rank;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.SOLUTION_JUSTIFICATION, (AbsTerm) onto.fromObject(getJustification()));
      abs.set(CBRTerminologyOntology.SOLUTION_NAME, (AbsTerm) onto.fromObject(getName()));
      abs.set(CBRTerminologyOntology.SOLUTION_RANK, (AbsTerm) onto.fromObject(getRank()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Solution");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      justification = (Description)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SOLUTION_JUSTIFICATION));
      name = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SOLUTION_NAME));
      rank = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SOLUTION_RANK));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Solution");
     }
   }

}
