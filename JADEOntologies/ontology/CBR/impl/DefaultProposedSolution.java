package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: ProposedSolution
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public class DefaultProposedSolution implements ProposedSolution, Serializable {
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

  public DefaultProposedSolution() {
    this._internalInstanceName = "";
  }

  public DefaultProposedSolution(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
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
   * Protege name: evaluatedSolution
   */
   private PossibleSolution evaluatedSolution;
   public void setEvaluatedSolution(PossibleSolution value) { 
     pcs.firePropertyChange("evaluatedSolution", (this.evaluatedSolution==null?new PossibleSolution():this.evaluatedSolution), value);
    this.evaluatedSolution=value;
   }
   public PossibleSolution getEvaluatedSolution() {
     return this.evaluatedSolution;
   }

   /**
   * Protege name: certaintyDegree
   */
   private String certaintyDegree;
   public void setCertaintyDegree(String value) { 
     pcs.firePropertyChange("certaintyDegree", (this.certaintyDegree==null?new String():this.certaintyDegree), value);
    this.certaintyDegree=value;
   }
   public String getCertaintyDegree() {
     return this.certaintyDegree;
   }

}
