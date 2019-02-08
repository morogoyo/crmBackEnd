import { CompanyModuleModule } from './company-module.module';

describe('CompanyModuleModule', () => {
  let companyModuleModule: CompanyModuleModule;

  beforeEach(() => {
    companyModuleModule = new CompanyModuleModule();
  });

  it('should create an instance', () => {
    expect(companyModuleModule).toBeTruthy();
  });
});
