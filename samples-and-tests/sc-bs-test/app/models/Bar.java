/**
 * Bar
 * 07.07.2012
 * @author Philipp Haussleiter
 *
 */
package models;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Bar extends Model {

    @Required
    public String name;
    @Required
    @Temporal(TemporalType.DATE)
    public Date createdAt;
    @Temporal(TemporalType.DATE)
    public Date updatedAt;
    @OneToMany(mappedBy = "bar")
    public List<Foo> foos;
}
