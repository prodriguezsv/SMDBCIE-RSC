package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.taxonomy.*;

/**
* Protege name: Describes
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultDescribes implements Describes, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultDescribes() {
    this._internalInstanceName = "";
  }

  public DefaultDescribes(String instance_name) {
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(TaxonomyOntology.DESCRIBES_ATTRIBUTE, (AbsTerm) onto.fromObject(getAttribute()));
      abs.set(TaxonomyOntology.DESCRIBES_SCORE, (AbsTerm) onto.fromObject(getScore()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Describes");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      attribute = (Attribute)onto.toObject(abs.getAbsObject(TaxonomyOntology.DESCRIBES_ATTRIBUTE));
      score = (List)onto.toObject(abs.getAbsObject(TaxonomyOntology.DESCRIBES_SCORE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Describes");
     }
   }

}
