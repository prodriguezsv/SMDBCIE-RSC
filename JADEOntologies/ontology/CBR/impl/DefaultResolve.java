package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: Resolve
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public class DefaultResolve implements Resolve, Serializable {
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

  public DefaultResolve() {
    this._internalInstanceName = "";
  }

  public DefaultResolve(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
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
