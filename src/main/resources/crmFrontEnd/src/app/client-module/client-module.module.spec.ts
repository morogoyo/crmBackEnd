import { ClientModuleModule } from './client-module.module';

describe('ClientModuleModule', () => {
  let clientModuleModule: ClientModuleModule;

  beforeEach(() => {
    clientModuleModule = new ClientModuleModule();
  });

  it('should create an instance', () => {
    expect(clientModuleModule).toBeTruthy();
  });
});
