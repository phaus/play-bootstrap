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
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Foo extends Model {
    @Required
    public String name;
    public int count;
    @Required
    @Temporal(TemporalType.DATE)
    public Date createdAt;
    @Temporal(TemporalType.DATE)
    public Date updatedAt;
    @ManyToOne
    public Bar bar;
}
