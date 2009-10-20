package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.taxonomy.*;

/**
* Protege name: WeightedDescription
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultWeightedDescription implements WeightedDescription, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultWeightedDescription() {
    this._internalInstanceName = "";
  }

  public DefaultWeightedDescription(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: weightedDescriptors
   */
   private List weightedDescriptors = new ArrayList();
   public void addWeightedDescriptors(WeightedDescriptor elem) { 
     weightedDescriptors.add(elem);
   }
   public boolean removeWeightedDescriptors(WeightedDescriptor elem) {
     boolean result = weightedDescriptors.remove(elem);
     return result;
   }
   public void clearAllWeightedDescriptors() {
     weightedDescriptors.clear();
   }
   public Iterator getAllWeightedDescriptors() {return weightedDescriptors.iterator(); }
   public List getWeightedDescriptors() {return weightedDescriptors; }
   public void setWeightedDescriptors(List l) {weightedDescriptors = l; }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(TaxonomyOntology.WEIGHTEDDESCRIPTION_WEIGHTEDDESCRIPTORS, (AbsTerm) onto.fromObject(getWeightedDescriptors()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising WeightedDescription");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      weightedDescriptors = (List)onto.toObject(abs.getAbsObject(TaxonomyOntology.WEIGHTEDDESCRIPTION_WEIGHTEDDESCRIPTORS));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising WeightedDescription");
     }
   }

}
