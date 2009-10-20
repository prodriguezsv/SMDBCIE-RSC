package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: Taxon
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public class DefaultTaxon implements Taxon, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = 1907932705116471396L;

  private String _internalInstanceName = null;

  public DefaultTaxon() {
    this._internalInstanceName = "";
  }

  public DefaultTaxon(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: level
   */
   private String level;
   public void setLevel(String value) { 
     pcs.firePropertyChange("level", (this.level==null?new String():this.level), value);
    this.level=value;
   }
   public String getLevel() {
     return this.level;
   }

   /**
   * Protege name: name
   */
   private String name;
   public void setName(String value) { 
     pcs.firePropertyChange("name", (this.name==null?new String():this.name), value);
    this.name=value;
   }
   public String getName() {
     return this.name;
   }

   /**
   * Protege name: weightedDescription
   */
   private WeightedDescription weightedDescription;
   public void setWeightedDescription(WeightedDescription value) { 
     pcs.firePropertyChange("weightedDescription", (this.weightedDescription==null?new WeightedDescription():this.weightedDescription), value);
    this.weightedDescription=value;
   }
   public WeightedDescription getWeightedDescription() {
     return this.weightedDescription;
   }

   /**
   * Protege name: predecessor
   */
   private Taxon predecessor;
   public void setPredecessor(Taxon value) { 
     pcs.firePropertyChange("predecessor", (this.predecessor==null?new Taxon():this.predecessor), value);
    this.predecessor=value;
   }
   public Taxon getPredecessor() {
     return this.predecessor;
   }

   /**
   * Protege name: successors
   */
   private List successors = new ArrayList();
   public void addSuccessors(Taxon elem) { 
     successors.add(elem);
     pcs.firePropertyChange("successors", oldList, this.successors);
   }
   public boolean removeSuccessors(Taxon elem) {
     boolean result = successors.remove(elem);
     pcs.firePropertyChange("successors", oldList, this.successors);
     return result;
   }
   public void clearAllSuccessors() {
     successors.clear();
     pcs.firePropertyChange("successors", oldList, this.successors);
   }
   public Iterator getAllSuccessors() {return successors.iterator(); }
   public List getSuccessors() {return successors; }
   public void setSuccessors(List l) {successors = l; }

}
