# LunaGC-5.4.0

旧 Discord https://discord.gg/8vSyTHVphj

# 安装指南

本指南非常简洁，仅包含启动服务器和客户端的步骤。
连接服务器需要使用Fiddler。
然而，如果你需要更详细的指南和服务器帮助，请参考GrassCutter的官方仓库和Discord服务器。

## 阅读手册（在文件末尾找到）
## 这里提到的一些内容（如祈愿等）将无法使用。

## 主要要求

- 获取 [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- 获取 [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- 获取 [NodeJS](https://nodejs.org/dist/v20.15.0/node-v20.15.0-x64.msi)
- 获取游戏版本REL5.4.0（如果你没有5.4.0客户端，可以在这里找到，包括音频文件）：

| 下载链接 | 包大小 | 解压后的包大小 | MD5校验码 |
| :---: | :---: | :---: | :---: |
| [GenshinImpact_5.4.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.001) | 10.0 GB | 20.0 GB | d7ea7d49334e03e590db3f047cd9ea88 |
| [GenshinImpact_5.4.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.002) | 10.0 GB | 20.0 GB | b4178034c1d09e889e43fd76b3fb4d3c |
| [GenshinImpact_5.4.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.003) | 10.0 GB | 20.0 GB | 43b70975fcb957abaaaf7d940969679a |
| [GenshinImpact_5.4.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.004) | 10.0 GB | 20.0 GB | d734b1edeb1b2b0d47d4d4bab7af6778 |
| [GenshinImpact_5.4.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.005) | 10.0 GB | 20.0 GB | 95abe987ff924c21f3e5085492448760 |
| [GenshinImpact_5.4.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.006) | 10.0 GB | 20.0 GB | 492510ae74ae8ac696ee59b4e831d039 |
| [GenshinImpact_5.4.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.007) | 10.0 GB | 20.0 GB | 0c68334b33ee878c5beac321339b9447 |
| [GenshinImpact_5.4.0.zip.008](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/GenshinImpact_5.4.0.zip.008) | 0.97 GB | 1.9 GB | 18d44596a5f1467682f5e038c80bd92a |
| [Audio_Chinese_5.4.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/Audio_Chinese_5.4.0.zip) | 14.11 GB | 28.40 GB | 2727087a20d630d35efe804ae683e72e |
| [Audio_English(US)_5.4.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/Audio_English(US)_5.4.0.zip) | 16.24 GB | 32.49 GB | 76f338d1925ff39cbf73f0418e9ae354 |
| [Audio_Korean_5.4.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/Audio_Korean_5.4.0.zip) | 13.99 GB | 28.0 GB | 6356a494c7cce397bdbb1213aa6e7298 |
| [Audio_Japanese_5.4.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20250125201352_EiPmYLKVptWspsHf/Audio_Japanese_5.4.0.zip) | 18.43 GB | 36.88 GB | f2b1c1f217dafbcdf27aeece987256b7 |

- 确保安装Java并设置环境变量
- 编译服务器（参考指南中的"编译实际服务器"部分）
- 将 [Astrolabe.dll](https://github.com/pmagixc/LunaGC_5.4.0/raw/main/patch/Astrolabe.dll) 放入本地游戏根目录
- 下载 [资源文件](https://github.com/pmagixc/5.4-res)，在LunaGC文件夹内新建名为`Resources`的文件夹并将资源解压至此
- 将`useEncryption`、`Questing`和`useInRouting`设置为`false`（默认应为`false`，若非默认值请手动修改）
- 启动服务器和游戏，注意要在LunaGC控制台创建账户！
- 祝您玩得愉快🎮

### 编译实际服务器

**附注**：请确保根据你的操作系统附加正确的前缀和后缀（./用于Linux | .\用于Windows | 编译服务器JAR/手册时添加.bat用于Windows系统）。

**要求**：

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 或更高版本

- **附注**：在某些系统上生成手册可能会失败。要禁用手册生成，请在gradlew jar命令后附加 -PskipHandbook=1。

- **对于Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar

```
*如果你想知道，第一条命令是设置环境，而第二条命令是构建服务器JAR文件。*

- **对于Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*如果你想知道，第一条命令是使文件可执行，其余的参考Windows解释。*

### 你可以在项目根文件夹中找到输出的JAR文件。

### 手动编译手册
```shell
./gradlew generateHandbook
```

## 疑难解答
- 确保将useEncryption和useInRouting都设置为false，否则可能会遇到错误。
- 要使用Windy，请确保将luac文件放在C:\Windy（如果不存在则创建该文件夹）
- 如果遇到与MongoDB连接超时相关的错误，请检查mongodb服务是否正在运行。在Windows上：按Windows键和R键，然后输入services.msc，查找mongodb server，如果没有启动则右键单击并启动。在Linux上，可以使用systemctl status mongod查看其是否正在运行，如果没有则输入systemctl start mongod。然而，如果在Linux上遇到错误14，请更改mongodb文件夹和.sock文件的所有者（sudo chown -R mongodb
/var/lib/mongodb和sudo chown mongodb
/tmp/mongodb-27017.sock然后再尝试启动服务）。


## 如何制作或获取自定义横幅？
- 你可以从这个[GitHub仓库](https://github.com/Zhaokugua/Grasscutter_Banners)获取预制的Banner文件。
- 下载后将文件重命名为`Banners.json`，然后替换data文件夹中已有的同名文件。
- 该仓库还提供包含所有Banner的文件，使用方法与上面提到的相同。

### 制作自定义Banner
- 如果你想为角色或武器制作自定义Banner，你需要知道`prefabPath`、`titlePath`和角色/物品的ID。
- 趣闻：你可以将任何物品设为rateUp，即使它是4星而不是5星。

## 手动手册（已测试）
- 创建账户：`/account <username>`
- 获取所有成就：`/am grantall`
- 上帝模式：`/prop god 1`
- 进入秘境：`/dungeon <ID>`
- 无限体力：`/prop ns 0`
- 无限能量：`/prop UnlimitedEnergy 1`
- 充能：`/er`
- 为选择的角色设置命座：`/setConst <number 1 to 6>`
- 移除技能冷却：`/stat cdr 99`
- 更改天气：`/weather <sunny/rain/cloudy/thunderstorm/snow/mist>`
- 更改选定角色的天赋：`/talent <n/e/q/all> <level>`（n - 普通攻击，e - 技能，q - 爆发）
- 给予物品：`/g <itemId|avatarId|all|weapons|mats|avatars> [lv<number>] [r<refinement number>] [x<amount>] [c<constellation number>] [sl<skilllevel>]`
- 解锁所有：`/unlockall`
- 更改世界等级：`/prop wl <number>`
- 更改冒险等级：`/prop player_level <number between 1 and 60>`
- 更改游戏速度：`/gamespeed <0.1|0.2|0.5|0.75|1.0|1.5|2.0|3.0>`
- 获取9999相遇之缘：`/g 223 x9999`
- 获取9999纠缠之缘：`/g 224 x9999`
- 获取9999摩拉：`/g 202 x9999`
- 获取9999原石：`/g 201 x9999`
### 请确保不要在命令中包含<>或[]！<>中的内容为必填项，[]中的内容为选填项。
### 如何将所有东西最大化：`/g all lv90 r5 c6 c6 sl10` | 然后单独为材料使用：`/g mats x99999`

### 在地图上传送的方法：

方法1：

- 1: 解锁地图：`/prop um 1`
- 2: 打开地图
- 3: 使用传送点

方法2：

- 1: 打开地图
- 2: 将一个钓鱼标记（最后一个）放在你想传送的地方并标记。

### 如何获取角色/实体/材料等ID？
- 访问[ambr.top](https://ambr.top)
- 搜索材料/角色/敌人，ID在网站的URL中，例如，我搜索了火元素丘丘人弓箭手，链接为`ambr.top/en/archive/monster/21010501/pyro-hilichurl-shooter`，所以ID是21010501。

### 如何生成怪物？
- 从上面的ambr.top链接获取ID
- 在游戏聊天中输入`/spawn <id>`。你还可以通过输入`/help spawn`或`/spawn`来了解更多可用参数 | 示例：`/spawn 21010501`，这将生成一个火元素丘丘人。增加其HP：`/spawn 21010501 hp9999`，你可以通过上述方法了解更多参数。

### 如何使用全新的`/uid`命令？
- 支持富文本
- 设置自定义UID：`/uid set changethistext` | 粗体：`/uid set <b>changethistext</b>` | 斜体：`/uid set <i>changethistext</i>` | 组合：`/uid set <i><b>changethistext</b></i>` | 彩色文本（你需要一个HEX颜色代码，你可以通过搜索hex颜色选择器轻松获取）：`/uid set <color=#698ae8>changethistext</color>`
- 你还可以像这样包含空格：`/uid set <b>B O L D</b>`
- 你可以组合使用粗体、斜体和彩色文本
- 恢复到服务器默认UID：`/uid default`

## 不可用功能
- 任务
- 洞天
- 深渊
- 邮件
- 战令
- 活动
- 领取冒险等级/委托奖励
- 领取boss掉落
- 城市声望
- 角色突破
- 小道具
- 锻造
- 某些背包物品
- 武器精炼
- 游戏内首次登录注册（请使用控制台创建账户）
### 还有更多
