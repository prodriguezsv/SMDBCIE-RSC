package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: Case
* @author ontology bean generator
* @version 2009/10/7, 18:01:54
*/
public class DefaultCase implements Case, Serializable {
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

  public DefaultCase() {
    this._internalInstanceName = "";
  }

  public DefaultCase(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: solution
   */
   private Solution solution;
   public void setSolution(Solution value) { 
     pcs.firePropertyChange("solution", (this.solution==null?new Solution():this.solution), value);
    this.solution=value;
   }
   public Solution getSolution() {
     return this.solution;
   }

   /**
   * Protege name: state
   */
   private boolean state;
   public void setState(boolean value) { 
     pcs.firePropertyChange("state", this.state, value);
    this.state=value;
   }
   public boolean getState() {
     return this.state;
   }

   /**
   * Protege name: problem
   */
   private Problem problem;
   public void setProblem(Problem value) { 
     pcs.firePropertyChange("problem", (this.problem==null?new Problem():this.problem), value);
    this.problem=value;
   }
   public Problem getProblem() {
     return this.problem;
   }

}
