package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: MSCharacterDescriptor
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultMSCharacterDescriptor implements MSCharacterDescriptor, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultMSCharacterDescriptor() {
    this._internalInstanceName = "";
  }

  public DefaultMSCharacterDescriptor(String instance_name) {
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
   * Protege name: structure
   */
   private Object structure;
   public void setStructure(Object value) { 
    this.structure=value;
   }
   public Object getStructure() {
     return this.structure;
   }

   /**
   * Protege name: score
   */
   private List score = new ArrayList();
   public void addScore(Object elem) { 
     score.add(elem);
   }
   public boolean removeScore(Object elem) {
     boolean result = score.remove(elem);
     return result;
   }
   public void clearAllScore() {
     score.clear();
   }
   public Iterator getAllScore() {return score.iterator(); }
   public List getScore() {return score; }
   public void setScore(List l) {score = l; }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.MSCHARACTERDESCRIPTOR_ATTRIBUTE, (AbsTerm) onto.fromObject(getAttribute()));
      abs.set(CBRTerminologyOntology.MSCHARACTERDESCRIPTOR_STRUCTURE, (AbsTerm) onto.fromObject(getStructure()));
      abs.set(CBRTerminologyOntology.MSCHARACTERDESCRIPTOR_SCORE, (AbsTerm) onto.fromObject(getScore()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising MSCharacterDescriptor");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      attribute = (Attribute)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.MSCHARACTERDESCRIPTOR_ATTRIBUTE));
      structure = (Object)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.MSCHARACTERDESCRIPTOR_STRUCTURE));
      score = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.MSCHARACTERDESCRIPTOR_SCORE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising MSCharacterDescriptor");
     }
   }

}
