/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "ADDBUSINFO", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Addbusinfo.findAll", query = "SELECT a FROM Addbusinfo a")
    , @NamedQuery(name = "Addbusinfo.findById", query = "SELECT a FROM Addbusinfo a WHERE a.id = :id")
    , @NamedQuery(name = "Addbusinfo.findByBusNumber", query = "SELECT a FROM Addbusinfo a WHERE a.busNumber = :busNumber")
    , @NamedQuery(name = "Addbusinfo.findByBusSource", query = "SELECT a FROM Addbusinfo a WHERE a.busSource = :busSource")
    , @NamedQuery(name = "Addbusinfo.findByBusDestination", query = "SELECT a FROM Addbusinfo a WHERE a.busDestination = :busDestination")
    , @NamedQuery(name = "Addbusinfo.findByBusTime", query = "SELECT a FROM Addbusinfo a WHERE a.busTime = :busTime")
    , @NamedQuery(name = "Addbusinfo.findByBusPrice", query = "SELECT a FROM Addbusinfo a WHERE a.busPrice = :busPrice")
    , @NamedQuery(name = "Addbusinfo.findByBusMove", query = "SELECT a FROM Addbusinfo a WHERE a.busMove = :busMove")
    , @NamedQuery(name = "Addbusinfo.findByBusDate", query = "SELECT a FROM Addbusinfo a WHERE a.busDate = :busDate")
    , @NamedQuery(name = "Addbusinfo.findByBusSeats", query = "SELECT a FROM Addbusinfo a WHERE a.busSeats = :busSeats")})
public class Addbusinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "BUS_NUMBER")
    private BigInteger busNumber;
    @Column(name = "BUS_SOURCE")
    private String busSource;
    @Column(name = "BUS_DESTINATION")
    private String busDestination;
    @Column(name = "BUS_TIME")
    private String busTime;
    @Column(name = "BUS_PRICE")
    private String busPrice;
    @Column(name = "BUS_MOVE")
    private String busMove;
    @Column(name = "BUS_DATE")
    private String busDate;
    @Column(name = "BUS_SEATS")
    private String busSeats;

    public Addbusinfo() {
    }

    public Addbusinfo(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        BigDecimal oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public BigInteger getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(BigInteger busNumber) {
        BigInteger oldBusNumber = this.busNumber;
        this.busNumber = busNumber;
        changeSupport.firePropertyChange("busNumber", oldBusNumber, busNumber);
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        String oldBusSource = this.busSource;
        this.busSource = busSource;
        changeSupport.firePropertyChange("busSource", oldBusSource, busSource);
    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        String oldBusDestination = this.busDestination;
        this.busDestination = busDestination;
        changeSupport.firePropertyChange("busDestination", oldBusDestination, busDestination);
    }

    public String getBusTime() {
        return busTime;
    }

    public void setBusTime(String busTime) {
        String oldBusTime = this.busTime;
        this.busTime = busTime;
        changeSupport.firePropertyChange("busTime", oldBusTime, busTime);
    }

    public String getBusPrice() {
        return busPrice;
    }

    public void setBusPrice(String busPrice) {
        String oldBusPrice = this.busPrice;
        this.busPrice = busPrice;
        changeSupport.firePropertyChange("busPrice", oldBusPrice, busPrice);
    }

    public String getBusMove() {
        return busMove;
    }

    public void setBusMove(String busMove) {
        String oldBusMove = this.busMove;
        this.busMove = busMove;
        changeSupport.firePropertyChange("busMove", oldBusMove, busMove);
    }

    public String getBusDate() {
        return busDate;
    }

    public void setBusDate(String busDate) {
        String oldBusDate = this.busDate;
        this.busDate = busDate;
        changeSupport.firePropertyChange("busDate", oldBusDate, busDate);
    }

    public String getBusSeats() {
        return busSeats;
    }

    public void setBusSeats(String busSeats) {
        String oldBusSeats = this.busSeats;
        this.busSeats = busSeats;
        changeSupport.firePropertyChange("busSeats", oldBusSeats, busSeats);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addbusinfo)) {
            return false;
        }
        Addbusinfo other = (Addbusinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.Addbusinfo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
