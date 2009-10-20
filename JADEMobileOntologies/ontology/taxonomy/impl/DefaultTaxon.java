package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.taxonomy.*;

/**
* Protege name: Taxon
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultTaxon implements Taxon, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

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
   * Protege name: weightedDescription
   */
   private WeightedDescription weightedDescription;
   public void setWeightedDescription(WeightedDescription value) { 
    this.weightedDescription=value;
   }
   public WeightedDescription getWeightedDescription() {
     return this.weightedDescription;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(TaxonomyOntology.TAXON_LEVEL, (AbsTerm) onto.fromObject(getLevel()));
      abs.set(TaxonomyOntology.TAXON_NAME, (AbsTerm) onto.fromObject(getName()));
      abs.set(TaxonomyOntology.TAXON_SUCCESSORS, (AbsTerm) onto.fromObject(getSuccessors()));
      abs.set(TaxonomyOntology.TAXON_PREDECESSOR, (AbsTerm) onto.fromObject(getPredecessor()));
      abs.set(TaxonomyOntology.TAXON_WEIGHTEDDESCRIPTION, (AbsTerm) onto.fromObject(getWeightedDescription()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Taxon");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      level = (String)onto.toObject(abs.getAbsObject(TaxonomyOntology.TAXON_LEVEL));
      name = (String)onto.toObject(abs.getAbsObject(TaxonomyOntology.TAXON_NAME));
      successors = (List)onto.toObject(abs.getAbsObject(TaxonomyOntology.TAXON_SUCCESSORS));
      predecessor = (Taxon)onto.toObject(abs.getAbsObject(TaxonomyOntology.TAXON_PREDECESSOR));
      weightedDescription = (WeightedDescription)onto.toObject(abs.getAbsObject(TaxonomyOntology.TAXON_WEIGHTEDDESCRIPTION));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Taxon");
     }
   }

}
