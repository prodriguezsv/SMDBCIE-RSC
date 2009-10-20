package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: Modifier
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultModifier implements Modifier, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultModifier() {
    this._internalInstanceName = "";
  }

  public DefaultModifier(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: structureWeight
   */
   private float structureWeight;
   public void setStructureWeight(float value) { 
    this.structureWeight=value;
   }
   public float getStructureWeight() {
     return this.structureWeight;
   }

   /**
   * Protege name: attributeWeight
   */
   private float attributeWeight;
   public void setAttributeWeight(float value) { 
    this.attributeWeight=value;
   }
   public float getAttributeWeight() {
     return this.attributeWeight;
   }

   /**
   * Protege name: scoreWeight
   */
   private float scoreWeight;
   public void setScoreWeight(float value) { 
    this.scoreWeight=value;
   }
   public float getScoreWeight() {
     return this.scoreWeight;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.MODIFIER_STRUCTUREWEIGHT, structureWeight);
      abs.set(CBRTerminologyOntology.MODIFIER_ATTRIBUTEWEIGHT, attributeWeight);
      abs.set(CBRTerminologyOntology.MODIFIER_SCOREWEIGHT, scoreWeight);
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Modifier");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      structureWeight = abs.getFloat(CBRTerminologyOntology.MODIFIER_STRUCTUREWEIGHT);
      attributeWeight = abs.getFloat(CBRTerminologyOntology.MODIFIER_ATTRIBUTEWEIGHT);
      scoreWeight = abs.getFloat(CBRTerminologyOntology.MODIFIER_SCOREWEIGHT);
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Modifier");
     }
   }

}
