package Repository;

import com.example.temperaturecontrol.model.TemperatureReading;
import org.springframework.data.jpa.repository.JpaRepository;import com.example.temperaturecontrol.model.TemperatureReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureReadingRepository extends JpaRepository<TemperatureReading, Long> {
}