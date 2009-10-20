package ontology.common.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.common.*;

/**
* Protege name: AppliesTo
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public class DefaultAppliesTo implements AppliesTo, Introspectable {

  private static final long serialVersionUID = 2105474187493131833L;

  private String _internalInstanceName = null;

  public DefaultAppliesTo() {
    this._internalInstanceName = "";
  }

  public DefaultAppliesTo(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: attribute
   */
   private Attribute attribute;
   public void setAttribute(Attribute value) { 
    this.attribute=value;
   }
   public Attribute getAttribute() {
     return this.attribute;
   }

   /**
   * Protege name: descriptiveElement
   */
   private Object descriptiveElement;
   public void setDescriptiveElement(Object value) { 
    this.descriptiveElement=value;
   }
   public Object getDescriptiveElement() {
     return this.descriptiveElement;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(CommonTerminologyOntology.APPLIESTO_ATTRIBUTE, (AbsTerm) onto.fromObject(getAttribute()));
      abs.set(CommonTerminologyOntology.APPLIESTO_DESCRIPTIVEELEMENT, (AbsTerm) onto.fromObject(getDescriptiveElement()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising AppliesTo");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      attribute = (Attribute)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.APPLIESTO_ATTRIBUTE));
      descriptiveElement = (Object)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.APPLIESTO_DESCRIPTIVEELEMENT));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising AppliesTo");
     }
   }

}
