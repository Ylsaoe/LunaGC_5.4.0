package emu.grasscutter.server.http.dispatch;

public class HotUpdateResourceDownload {
  public static class Resource {
    public String resourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/5.4_live";
    
    public String dataUrl = "https://autopatchcn.yuanshen.com/client_design_data/5.4_live";
    
    public String resourceUrlBak = "5.4_live";
    
    public int clientDataVersion = 30844639;
    
    public int clientSilenceDataVersion = 30738672;
    
    public String clientDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"ab62e2934fc1517afa7461414f6a39fd\", \"hash\": \"2795fb4938c7443e\", \"fileSize\": 68709}\r\n{\"remoteName\": \"data_versions_medium\", \"md5\": \"3d6f7390703d5914da2954f7f48f9f73\", \"hash\": \"50fa31c12b15a538\", \"fileSize\": 6666}";
    
    public String clientSilenceDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"2bf5c0d17e30f0628cb1975cfaeff003\", \"hash\": \"15784c065054338f\", \"fileSize\": 522}";
    
    public HotUpdateResourceDownload.ResVersionConfig resVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
    
    public String clientVersionSuffix = "59aa62852a";
    
    public String clientSilenceVersionSuffix = "d081d2e70f";
    
    public String nextResourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/5.4_live";
    
    public HotUpdateResourceDownload.ResVersionConfig nextResVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
  }
  
  public static class ResVersionConfig {
    public int version = 30666138;
    
    public String md5 = "{\"remoteName\": \"res_versions_external\", \"md5\": \"5ed4687111440f75650ee8cd9b7719e8\", \"hash\": \"dc9b7e145021e7e3\", \"fileSize\": 175923}\r\n{\"remoteName\": \"res_versions_medium\", \"md5\": \"6b3ef138214b1c7566c1c395ff5b38aa\", \"hash\": \"529e5b82b8c802f3\", \"fileSize\": 12072}\r\n{\"remoteName\": \"res_versions_streaming\", \"md5\": \"ff810a4c9a9553f20846a9d8dd0d0cb2\", \"hash\": \"114d270362090831\", \"fileSize\": 2641}\r\n{\"remoteName\": \"base_revision\", \"md5\": \"bd1ba2fde4ddd7cb4846cf0fe5de590e\", \"hash\": \"dcf27ba4df1e1492\", \"fileSize\": 19}\r\n{\"remoteName\": \"patch_node_versions\", \"md5\": \"9942b95c226a6e11e29a49a439f97bbe\", \"hash\": \"0c6e4ea548ff4e5a\", \"fileSize\": 3955}";
  
    public String releaseTotalSize = "0";
    
    public String versionSuffix = "eeba17546b";
    
    public String branch = "5.4_live";
  }
}