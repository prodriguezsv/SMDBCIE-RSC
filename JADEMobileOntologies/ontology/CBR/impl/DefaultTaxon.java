package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: Taxon
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultTaxon implements Taxon, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultTaxon() {
    this._internalInstanceName = "";
  }

  public DefaultTaxon(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: level
   */
   private String level;
   public void setLevel(String value) { 
    this.level=value;
   }
   public String getLevel() {
     return this.level;
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
   * Protege name: weightedDescription
   */
   private WeightedDescription weightedDescription;
   public void setWeightedDescription(WeightedDescription value) { 
    this.weightedDescription=value;
   }
   public WeightedDescription getWeightedDescription() {
     return this.weightedDescription;
   }

   /**
   * Protege name: predecessor
   */
   private Taxon predecessor;
   public void setPredecessor(Taxon value) { 
    this.predecessor=value;
   }
   public Taxon getPredecessor() {
     return this.predecessor;
   }

   /**
   * Protege name: successors
   */
   private List successors = new ArrayList();
   public void addSuccessors(Taxon elem) { 
     successors.add(elem);
   }
   public boolean removeSuccessors(Taxon elem) {
     boolean result = successors.remove(elem);
     return result;
   }
   public void clearAllSuccessors() {
     successors.clear();
   }
   public Iterator getAllSuccessors() {return successors.iterator(); }
   public List getSuccessors() {return successors; }
   public void setSuccessors(List l) {successors = l; }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.TAXON_LEVEL, (AbsTerm) onto.fromObject(getLevel()));
      abs.set(CBRTerminologyOntology.TAXON_NAME, (AbsTerm) onto.fromObject(getName()));
      abs.set(CBRTerminologyOntology.TAXON_WEIGHTEDDESCRIPTION, (AbsTerm) onto.fromObject(getWeightedDescription()));
      abs.set(CBRTerminologyOntology.TAXON_PREDECESSOR, (AbsTerm) onto.fromObject(getPredecessor()));
      abs.set(CBRTerminologyOntology.TAXON_SUCCESSORS, (AbsTerm) onto.fromObject(getSuccessors()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Taxon");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      level = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.TAXON_LEVEL));
      name = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.TAXON_NAME));
      weightedDescription = (WeightedDescription)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.TAXON_WEIGHTEDDESCRIPTION));
      predecessor = (Taxon)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.TAXON_PREDECESSOR));
      successors = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.TAXON_SUCCESSORS));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Taxon");
     }
   }

}
