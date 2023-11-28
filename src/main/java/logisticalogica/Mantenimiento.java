
package logisticalogica;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


    @Entity
    @Table(name = "Mantenimiento")
    public class Mantenimiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mantenimientoID")
    private Integer mantenimientoID;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
   
    @Column (name = "proximomantenimiento")
    private Integer proximomantenimiento;
   
    @Column(name = "km")
    private Integer km;

    @ManyToOne
    @JoinColumn(name = "vehiculoID")
    private Vehiculo vehiculo;

    public Mantenimiento(Integer mantenimientoID, Date fecha, Integer proximomantenimiento, Integer km, Vehiculo vehiculo) {
        this.mantenimientoID = mantenimientoID;
        this.fecha = fecha;
        this.proximomantenimiento = proximomantenimiento;
        this.km = km;
        this.vehiculo = vehiculo;
    }

    public Mantenimiento() {
    }

    public Integer getProximomantenimiento() {
        return proximomantenimiento;
    }

    public void setProximomantenimiento(Integer proximomantenimiento) {
        this.proximomantenimiento = proximomantenimiento;
    }
    
    
    public Integer getMantenimientoID() {
        return mantenimientoID;
    }

    public void setMantenimientoID(Integer mantenimientoID) {
        this.mantenimientoID = mantenimientoID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
   
}
