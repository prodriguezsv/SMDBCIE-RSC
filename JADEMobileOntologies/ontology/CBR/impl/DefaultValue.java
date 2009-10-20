package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: Value
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultValue implements Value, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultValue() {
    this._internalInstanceName = "";
  }

  public DefaultValue(String instance_name) {
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.VALUE_DESCRIBES, (AbsTerm) onto.fromObject(getDescribes()));
      abs.set(CBRTerminologyOntology.VALUE_MEASURINGUNIT, (AbsTerm) onto.fromObject(getMeasuringUnit()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Value");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      describes = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.VALUE_DESCRIBES));
      measuringUnit = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.VALUE_MEASURINGUNIT));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Value");
     }
   }

}
