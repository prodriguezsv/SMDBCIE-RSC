package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: WeightedDescriptor
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultWeightedDescriptor implements WeightedDescriptor, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

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
   * Protege name: modifier
   */
   private Modifier modifier;
   public void setModifier(Modifier value) { 
    this.modifier=value;
   }
   public Modifier getModifier() {
     return this.modifier;
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.WEIGHTEDDESCRIPTOR_MODIFIER, (AbsTerm) onto.fromObject(getModifier()));
      abs.set(CBRTerminologyOntology.WEIGHTEDDESCRIPTOR_DESCRIPTOR, (AbsTerm) onto.fromObject(getDescriptor()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising WeightedDescriptor");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      modifier = (Modifier)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.WEIGHTEDDESCRIPTOR_MODIFIER));
      descriptor = (Descriptor)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.WEIGHTEDDESCRIPTOR_DESCRIPTOR));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising WeightedDescriptor");
     }
   }

}
