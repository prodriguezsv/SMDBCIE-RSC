package ontology.common.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.common.*;

/**
* Protege name: QualitativeCharacterDescriptor
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public class DefaultQualitativeCharacterDescriptor implements QualitativeCharacterDescriptor, Introspectable {

  private static final long serialVersionUID = 2105474187493131833L;

  private String _internalInstanceName = null;

  public DefaultQualitativeCharacterDescriptor() {
    this._internalInstanceName = "";
  }

  public DefaultQualitativeCharacterDescriptor(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CommonTerminologyOntology.QUALITATIVECHARACTERDESCRIPTOR_SCORE, (AbsTerm) onto.fromObject(getScore()));
      abs.set(CommonTerminologyOntology.QUALITATIVECHARACTERDESCRIPTOR_ATTRIBUTE, (AbsTerm) onto.fromObject(getAttribute()));
      abs.set(CommonTerminologyOntology.QUALITATIVECHARACTERDESCRIPTOR_STRUCTURE, (AbsTerm) onto.fromObject(getStructure()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising QualitativeCharacterDescriptor");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      score = (List)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.QUALITATIVECHARACTERDESCRIPTOR_SCORE));
      attribute = (Attribute)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.QUALITATIVECHARACTERDESCRIPTOR_ATTRIBUTE));
      structure = (Object)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.QUALITATIVECHARACTERDESCRIPTOR_STRUCTURE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising QualitativeCharacterDescriptor");
     }
   }

}
