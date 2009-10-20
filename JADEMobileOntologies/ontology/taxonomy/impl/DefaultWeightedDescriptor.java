package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.taxonomy.*;

/**
* Protege name: WeightedDescriptor
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultWeightedDescriptor implements WeightedDescriptor, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultWeightedDescriptor() {
    this._internalInstanceName = "";
  }

  public DefaultWeightedDescriptor(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: descriptor
   */
   private Descriptor descriptor;
   public void setDescriptor(Descriptor value) { 
    this.descriptor=value;
   }
   public Descriptor getDescriptor() {
     return this.descriptor;
   }

   /**
   * Protege name: modifier
   */
   private Modifier modifier;
   public void setModifier(Modifier value) { 
    this.modifier=value;
   }
   public Modifier getModifier() {
     return this.modifier;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(TaxonomyOntology.WEIGHTEDDESCRIPTOR_DESCRIPTOR, (AbsTerm) onto.fromObject(getDescriptor()));
      abs.set(TaxonomyOntology.WEIGHTEDDESCRIPTOR_MODIFIER, (AbsTerm) onto.fromObject(getModifier()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising WeightedDescriptor");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      descriptor = (Descriptor)onto.toObject(abs.getAbsObject(TaxonomyOntology.WEIGHTEDDESCRIPTOR_DESCRIPTOR));
      modifier = (Modifier)onto.toObject(abs.getAbsObject(TaxonomyOntology.WEIGHTEDDESCRIPTOR_MODIFIER));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising WeightedDescriptor");
     }
   }

}
