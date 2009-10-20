package ontology.taxonomy;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: Taxon
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public interface Taxon extends jade.content.Concept, Introspectable {

   /**
   * Protege name: level
   */
   public void setLevel(String value);
   public String getLevel();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: successors
   */
   public void addSuccessors(Taxon elem);
   public boolean removeSuccessors(Taxon elem);
   public void clearAllSuccessors();
   public Iterator getAllSuccessors();
   public List getSuccessors();
   public void setSuccessors(List l);

   /**
   * Protege name: predecessor
   */
   public void setPredecessor(Taxon value);
   public Taxon getPredecessor();

   /**
   * Protege name: weightedDescription
   */
   public void setWeightedDescription(WeightedDescription value);
   public WeightedDescription getWeightedDescription();

}
