package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.taxonomy.*;

/**
* Protege name: HeuristicDescriptor
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultHeuristicDescriptor implements HeuristicDescriptor, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultHeuristicDescriptor() {
    this._internalInstanceName = "";
  }

  public DefaultHeuristicDescriptor(String instance_name) {
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
      abs.set(TaxonomyOntology.HEURISTICDESCRIPTOR_ATTRIBUTE, (AbsTerm) onto.fromObject(getAttribute()));
      abs.set(TaxonomyOntology.HEURISTICDESCRIPTOR_SCORE, (AbsTerm) onto.fromObject(getScore()));
      abs.set(TaxonomyOntology.HEURISTICDESCRIPTOR_STRUCTURE, (AbsTerm) onto.fromObject(getStructure()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising HeuristicDescriptor");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      attribute = (Attribute)onto.toObject(abs.getAbsObject(TaxonomyOntology.HEURISTICDESCRIPTOR_ATTRIBUTE));
      score = (List)onto.toObject(abs.getAbsObject(TaxonomyOntology.HEURISTICDESCRIPTOR_SCORE));
      structure = (Object)onto.toObject(abs.getAbsObject(TaxonomyOntology.HEURISTICDESCRIPTOR_STRUCTURE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising HeuristicDescriptor");
     }
   }

}
