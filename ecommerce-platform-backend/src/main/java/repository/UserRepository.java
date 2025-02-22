package repository;


    import com.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
    }


