/**
 * Foo
 * 07.07.2012
 * @author Philipp Haussleiter
 *
 */
package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import play.db.jpa.Model;

@Entity
public class Foo extends Model {

    public String name;
    public int count;
    @Temporal(TemporalType.DATE)
    public Date createdAt;
    @Temporal(TemporalType.DATE)
    public Date updatedAt;
    @ManyToOne
    public Bar bar;
}
