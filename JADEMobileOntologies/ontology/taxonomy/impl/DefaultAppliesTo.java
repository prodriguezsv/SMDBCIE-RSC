package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.taxonomy.*;

/**
* Protege name: AppliesTo
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultAppliesTo implements AppliesTo, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

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
   * Protege name: descriptiveElement
   */
   private Object descriptiveElement;
   public void setDescriptiveElement(Object value) { 
    this.descriptiveElement=value;
   }
   public Object getDescriptiveElement() {
     return this.descriptiveElement;
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(TaxonomyOntology.APPLIESTO_DESCRIPTIVEELEMENT, (AbsTerm) onto.fromObject(getDescriptiveElement()));
      abs.set(TaxonomyOntology.APPLIESTO_ATTRIBUTE, (AbsTerm) onto.fromObject(getAttribute()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising AppliesTo");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      descriptiveElement = (Object)onto.toObject(abs.getAbsObject(TaxonomyOntology.APPLIESTO_DESCRIPTIVEELEMENT));
      attribute = (Attribute)onto.toObject(abs.getAbsObject(TaxonomyOntology.APPLIESTO_ATTRIBUTE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising AppliesTo");
     }
   }

}
