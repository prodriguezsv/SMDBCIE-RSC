package ontology.common.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.common.*;

/**
* Protege name: Description
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public class DefaultDescription implements Description, Introspectable {

  private static final long serialVersionUID = 2105474187493131833L;

  private String _internalInstanceName = null;

  public DefaultDescription() {
    this._internalInstanceName = "";
  }

  public DefaultDescription(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: descriptors
   */
   private List descriptors = new ArrayList();
   public void addDescriptors(Descriptor elem) { 
     descriptors.add(elem);
   }
   public boolean removeDescriptors(Descriptor elem) {
     boolean result = descriptors.remove(elem);
     return result;
   }
   public void clearAllDescriptors() {
     descriptors.clear();
   }
   public Iterator getAllDescriptors() {return descriptors.iterator(); }
   public List getDescriptors() {return descriptors; }
   public void setDescriptors(List l) {descriptors = l; }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CommonTerminologyOntology.DESCRIPTION_DESCRIPTORS, (AbsTerm) onto.fromObject(getDescriptors()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Description");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      descriptors = (List)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.DESCRIPTION_DESCRIPTORS));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Description");
     }
   }

}
