package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: Problem
* @author ontology bean generator
* @version 2009/10/7, 18:01:54
*/
public class DefaultProblem implements Problem, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -192457562360579226L;

  private String _internalInstanceName = null;

  public DefaultProblem() {
    this._internalInstanceName = "";
  }

  public DefaultProblem(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: goalRank
   */
   private String goalRank;
   public void setGoalRank(String value) { 
     pcs.firePropertyChange("goalRank", (this.goalRank==null?new String():this.goalRank), value);
    this.goalRank=value;
   }
   public String getGoalRank() {
     return this.goalRank;
   }

   /**
   * Protege name: description
   */
   private Description description;
   public void setDescription(Description value) { 
     pcs.firePropertyChange("description", (this.description==null?new Description():this.description), value);
    this.description=value;
   }
   public Description getDescription() {
     return this.description;
   }

   /**
   * Protege name: leastSimilarityDegree
   */
   private String leastSimilarityDegree;
   public void setLeastSimilarityDegree(String value) { 
     pcs.firePropertyChange("leastSimilarityDegree", (this.leastSimilarityDegree==null?new String():this.leastSimilarityDegree), value);
    this.leastSimilarityDegree=value;
   }
   public String getLeastSimilarityDegree() {
     return this.leastSimilarityDegree;
   }

}
