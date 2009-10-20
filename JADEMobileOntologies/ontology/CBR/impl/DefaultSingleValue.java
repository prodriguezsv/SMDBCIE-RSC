package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: SingleValue
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultSingleValue implements SingleValue, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultSingleValue() {
    this._internalInstanceName = "";
  }

  public DefaultSingleValue(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: describes
   */
   private List describes = new ArrayList();
   public void addDescribes(Attribute elem) { 
     describes.add(elem);
   }
   public boolean removeDescribes(Attribute elem) {
     boolean result = describes.remove(elem);
     return result;
   }
   public void clearAllDescribes() {
     describes.clear();
   }
   public Iterator getAllDescribes() {return describes.iterator(); }
   public List getDescribes() {return describes; }
   public void setDescribes(List l) {describes = l; }

   /**
   * Protege name: measuringUnit
   */
   private String measuringUnit;
   public void setMeasuringUnit(String value) { 
    this.measuringUnit=value;
   }
   public String getMeasuringUnit() {
     return this.measuringUnit;
   }

   /**
   * Protege name: value
   */
   private float value;
   public void setValue(float value) { 
    this.value=value;
   }
   public float getValue() {
     return this.value;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.SINGLEVALUE_DESCRIBES, (AbsTerm) onto.fromObject(getDescribes()));
      abs.set(CBRTerminologyOntology.SINGLEVALUE_MEASURINGUNIT, (AbsTerm) onto.fromObject(getMeasuringUnit()));
      abs.set(CBRTerminologyOntology.SINGLEVALUE_VALUE, value);
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising SingleValue");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      describes = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SINGLEVALUE_DESCRIBES));
      measuringUnit = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.SINGLEVALUE_MEASURINGUNIT));
      value = abs.getFloat(CBRTerminologyOntology.SINGLEVALUE_VALUE);
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising SingleValue");
     }
   }

}
