package ontology.common.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.common.*;

/**
* Protege name: RangeValue
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public class DefaultRangeValue implements RangeValue, Introspectable {

  private static final long serialVersionUID = 2105474187493131833L;

  private String _internalInstanceName = null;

  public DefaultRangeValue() {
    this._internalInstanceName = "";
  }

  public DefaultRangeValue(String instance_name) {
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
   * Protege name: upperBound
   */
   private float upperBound;
   public void setUpperBound(float value) { 
    this.upperBound=value;
   }
   public float getUpperBound() {
     return this.upperBound;
   }

   /**
   * Protege name: lowerBound
   */
   private float lowerBound;
   public void setLowerBound(float value) { 
    this.lowerBound=value;
   }
   public float getLowerBound() {
     return this.lowerBound;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CommonTerminologyOntology.RANGEVALUE_MEASURINGUNIT, (AbsTerm) onto.fromObject(getMeasuringUnit()));
      abs.set(CommonTerminologyOntology.RANGEVALUE_DESCRIBES, (AbsTerm) onto.fromObject(getDescribes()));
      abs.set(CommonTerminologyOntology.RANGEVALUE_UPPERBOUND, upperBound);
      abs.set(CommonTerminologyOntology.RANGEVALUE_LOWERBOUND, lowerBound);
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising RangeValue");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      measuringUnit = (String)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.RANGEVALUE_MEASURINGUNIT));
      describes = (List)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.RANGEVALUE_DESCRIBES));
      upperBound = abs.getFloat(CommonTerminologyOntology.RANGEVALUE_UPPERBOUND);
      lowerBound = abs.getFloat(CommonTerminologyOntology.RANGEVALUE_LOWERBOUND);
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising RangeValue");
     }
   }

}
