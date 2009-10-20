package ontology.common.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.common.*;

/**
* Protege name: SingleValue
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public class DefaultSingleValue implements SingleValue, Introspectable {

  private static final long serialVersionUID = 2105474187493131833L;

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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CommonTerminologyOntology.SINGLEVALUE_MEASURINGUNIT, (AbsTerm) onto.fromObject(getMeasuringUnit()));
      abs.set(CommonTerminologyOntology.SINGLEVALUE_VALUE, value);
      abs.set(CommonTerminologyOntology.SINGLEVALUE_DESCRIBES, (AbsTerm) onto.fromObject(getDescribes()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising SingleValue");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      measuringUnit = (String)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.SINGLEVALUE_MEASURINGUNIT));
      value = abs.getFloat(CommonTerminologyOntology.SINGLEVALUE_VALUE);
      describes = (List)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.SINGLEVALUE_DESCRIBES));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising SingleValue");
     }
   }

}
