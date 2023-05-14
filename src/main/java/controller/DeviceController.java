package controller;

import model.Device;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DeviceService;

import java.util.List;


@RestController
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping
    public Device createDevice(@RequestBody Device device) {
        return deviceService.createDevice(device);
    }

    @GetMapping("/{id}")
    public Device getDeviceById(@PathVariable("id") Integer id) {
        return deviceService.getDeviceById(id);
    }

    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @DeleteMapping("/{id}")
    public void deleteDevice(@PathVariable("id") Integer id) {
        deviceService.deleteDevice(id);
    }

    @GetMapping("/{deviceId}/user")
    public User getDeviceUser(@PathVariable("deviceId") Integer deviceId) {
        return deviceService.getDeviceUser(deviceId);
    }
}

