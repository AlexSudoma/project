package service;

import model.Device;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.DeviceRepository;

import java.util.List;

@Service
@Transactional
public class DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device createDevice(Device device) {
        return deviceRepository.save(device);
    }

    public Device getDeviceById(Integer id) {
        return deviceRepository.findById(id).orElse(null);
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public void deleteDevice(Integer id) {
        deviceRepository.deleteById(id);
    }

    public User getDeviceUser(Integer deviceId) {
        Device device = getDeviceById(deviceId);
        if (device != null) {
            return device.getUser();
        }
        return null;
    }
}

