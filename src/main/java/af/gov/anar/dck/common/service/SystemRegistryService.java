package af.gov.anar.dck.common.service;

import af.gov.anar.dck.common.model.SystemRegistry;

import java.util.List;

public interface SystemRegistryService {
	public SystemRegistry create(SystemRegistry systemRegistry);
    public SystemRegistry delete(Long id);
    public List findAll();
    public List findAllByEnv(String envSlug);
    public SystemRegistry findById(Long id);
    public boolean update(Long id, SystemRegistry systemRegistry);
}