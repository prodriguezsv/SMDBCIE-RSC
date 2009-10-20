package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: Solution
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public class DefaultSolution implements Solution, Serializable {
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

  public DefaultSolution() {
    this._internalInstanceName = "";
  }

  public DefaultSolution(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: justification
   */
   private Description justification;
   public void setJustification(Description value) { 
     pcs.firePropertyChange("justification", (this.justification==null?new Description():this.justification), value);
    this.justification=value;
   }
   public Description getJustification() {
     return this.justification;
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
   * Protege name: rank
   */
   private String rank;
   public void setRank(String value) { 
     pcs.firePropertyChange("rank", (this.rank==null?new String():this.rank), value);
    this.rank=value;
   }
   public String getRank() {
     return this.rank;
   }

}
