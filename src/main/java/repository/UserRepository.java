package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{


//    @Query("SELECT u FROM User u WHERE u.first_name like %?1%")
//    List<User> findByLike(String first_name);
//
//    @Query("SELECT u FROM User u WHERE u.first_name like %?1%")
//    Page<User> findByLike(String first_name, Pageable pageable);
//
//    @Query(value = "SELECT * FROM users u WHERE u.first_name like %?1%",
//            nativeQuery = true)
//    List<User> findByLikeNative(String first_name);
}
