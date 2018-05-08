# io.swagger.client - Kotlin client library for EVE Swagger Interface

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

I guess? This is default description so I dunno.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://esi.tech.ccp.is/latest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllianceApi* | [**getAlliances**](docs/AllianceApi.md#getalliances) | **GET** /alliances/ | List all alliances
*AllianceApi* | [**getAlliancesAllianceId**](docs/AllianceApi.md#getalliancesallianceid) | **GET** /alliances/{alliance_id}/ | Get alliance information
*AllianceApi* | [**getAlliancesAllianceIdCorporations**](docs/AllianceApi.md#getalliancesallianceidcorporations) | **GET** /alliances/{alliance_id}/corporations/ | List alliance's corporations
*AllianceApi* | [**getAlliancesAllianceIdIcons**](docs/AllianceApi.md#getalliancesallianceidicons) | **GET** /alliances/{alliance_id}/icons/ | Get alliance icon
*AllianceApi* | [**getAlliancesNames**](docs/AllianceApi.md#getalliancesnames) | **GET** /alliances/names/ | Get alliance names
*AssetsApi* | [**getCharactersCharacterIdAssets**](docs/AssetsApi.md#getcharacterscharacteridassets) | **GET** /characters/{character_id}/assets/ | Get character assets
*AssetsApi* | [**getCorporationsCorporationIdAssets**](docs/AssetsApi.md#getcorporationscorporationidassets) | **GET** /corporations/{corporation_id}/assets/ | Get corporation assets
*AssetsApi* | [**postCharactersCharacterIdAssetsLocations**](docs/AssetsApi.md#postcharacterscharacteridassetslocations) | **POST** /characters/{character_id}/assets/locations/ | Get character asset locations
*AssetsApi* | [**postCharactersCharacterIdAssetsNames**](docs/AssetsApi.md#postcharacterscharacteridassetsnames) | **POST** /characters/{character_id}/assets/names/ | Get character asset names
*AssetsApi* | [**postCorporationsCorporationIdAssetsLocations**](docs/AssetsApi.md#postcorporationscorporationidassetslocations) | **POST** /corporations/{corporation_id}/assets/locations/ | Get corporation asset locations
*AssetsApi* | [**postCorporationsCorporationIdAssetsNames**](docs/AssetsApi.md#postcorporationscorporationidassetsnames) | **POST** /corporations/{corporation_id}/assets/names/ | Get coporation asset names
*BookmarksApi* | [**getCharactersCharacterIdBookmarks**](docs/BookmarksApi.md#getcharacterscharacteridbookmarks) | **GET** /characters/{character_id}/bookmarks/ | List bookmarks
*BookmarksApi* | [**getCharactersCharacterIdBookmarksFolders**](docs/BookmarksApi.md#getcharacterscharacteridbookmarksfolders) | **GET** /characters/{character_id}/bookmarks/folders/ | List bookmark folders
*BookmarksApi* | [**getCorporationsCorporationIdBookmarks**](docs/BookmarksApi.md#getcorporationscorporationidbookmarks) | **GET** /corporations/{corporation_id}/bookmarks/ | List corporation bookmarks
*BookmarksApi* | [**getCorporationsCorporationIdBookmarksFolders**](docs/BookmarksApi.md#getcorporationscorporationidbookmarksfolders) | **GET** /corporations/{corporation_id}/bookmarks/folders/ | List corporation bookmark folders
*CalendarApi* | [**getCharactersCharacterIdCalendar**](docs/CalendarApi.md#getcharacterscharacteridcalendar) | **GET** /characters/{character_id}/calendar/ | List calendar event summaries
*CalendarApi* | [**getCharactersCharacterIdCalendarEventId**](docs/CalendarApi.md#getcharacterscharacteridcalendareventid) | **GET** /characters/{character_id}/calendar/{event_id}/ | Get an event
*CalendarApi* | [**getCharactersCharacterIdCalendarEventIdAttendees**](docs/CalendarApi.md#getcharacterscharacteridcalendareventidattendees) | **GET** /characters/{character_id}/calendar/{event_id}/attendees/ | Get attendees
*CalendarApi* | [**putCharactersCharacterIdCalendarEventId**](docs/CalendarApi.md#putcharacterscharacteridcalendareventid) | **PUT** /characters/{character_id}/calendar/{event_id}/ | Respond to an event
*CharacterApi* | [**getCharactersCharacterId**](docs/CharacterApi.md#getcharacterscharacterid) | **GET** /characters/{character_id}/ | Get character's public information
*CharacterApi* | [**getCharactersCharacterIdAgentsResearch**](docs/CharacterApi.md#getcharacterscharacteridagentsresearch) | **GET** /characters/{character_id}/agents_research/ | Get agents research
*CharacterApi* | [**getCharactersCharacterIdBlueprints**](docs/CharacterApi.md#getcharacterscharacteridblueprints) | **GET** /characters/{character_id}/blueprints/ | Get blueprints
*CharacterApi* | [**getCharactersCharacterIdChatChannels**](docs/CharacterApi.md#getcharacterscharacteridchatchannels) | **GET** /characters/{character_id}/chat_channels/ | Get chat channels
*CharacterApi* | [**getCharactersCharacterIdCorporationhistory**](docs/CharacterApi.md#getcharacterscharacteridcorporationhistory) | **GET** /characters/{character_id}/corporationhistory/ | Get corporation history
*CharacterApi* | [**getCharactersCharacterIdFatigue**](docs/CharacterApi.md#getcharacterscharacteridfatigue) | **GET** /characters/{character_id}/fatigue/ | Get jump fatigue
*CharacterApi* | [**getCharactersCharacterIdMedals**](docs/CharacterApi.md#getcharacterscharacteridmedals) | **GET** /characters/{character_id}/medals/ | Get medals
*CharacterApi* | [**getCharactersCharacterIdNotifications**](docs/CharacterApi.md#getcharacterscharacteridnotifications) | **GET** /characters/{character_id}/notifications/ | Get character notifications
*CharacterApi* | [**getCharactersCharacterIdNotificationsContacts**](docs/CharacterApi.md#getcharacterscharacteridnotificationscontacts) | **GET** /characters/{character_id}/notifications/contacts/ | Get new contact notifications
*CharacterApi* | [**getCharactersCharacterIdPortrait**](docs/CharacterApi.md#getcharacterscharacteridportrait) | **GET** /characters/{character_id}/portrait/ | Get character portraits
*CharacterApi* | [**getCharactersCharacterIdRoles**](docs/CharacterApi.md#getcharacterscharacteridroles) | **GET** /characters/{character_id}/roles/ | Get character corporation roles
*CharacterApi* | [**getCharactersCharacterIdStandings**](docs/CharacterApi.md#getcharacterscharacteridstandings) | **GET** /characters/{character_id}/standings/ | Get standings
*CharacterApi* | [**getCharactersCharacterIdStats**](docs/CharacterApi.md#getcharacterscharacteridstats) | **GET** /characters/{character_id}/stats/ | Yearly aggregate stats
*CharacterApi* | [**getCharactersCharacterIdTitles**](docs/CharacterApi.md#getcharacterscharacteridtitles) | **GET** /characters/{character_id}/titles/ | Get character corporation titles
*CharacterApi* | [**getCharactersNames**](docs/CharacterApi.md#getcharactersnames) | **GET** /characters/names/ | Get character names
*CharacterApi* | [**postCharactersAffiliation**](docs/CharacterApi.md#postcharactersaffiliation) | **POST** /characters/affiliation/ | Character affiliation
*CharacterApi* | [**postCharactersCharacterIdCspa**](docs/CharacterApi.md#postcharacterscharacteridcspa) | **POST** /characters/{character_id}/cspa/ | Calculate a CSPA charge cost
*ClonesApi* | [**getCharactersCharacterIdClones**](docs/ClonesApi.md#getcharacterscharacteridclones) | **GET** /characters/{character_id}/clones/ | Get clones
*ClonesApi* | [**getCharactersCharacterIdImplants**](docs/ClonesApi.md#getcharacterscharacteridimplants) | **GET** /characters/{character_id}/implants/ | Get active implants
*ContactsApi* | [**deleteCharactersCharacterIdContacts**](docs/ContactsApi.md#deletecharacterscharacteridcontacts) | **DELETE** /characters/{character_id}/contacts/ | Delete contacts
*ContactsApi* | [**getAlliancesAllianceIdContacts**](docs/ContactsApi.md#getalliancesallianceidcontacts) | **GET** /alliances/{alliance_id}/contacts/ | Get alliance contacts
*ContactsApi* | [**getCharactersCharacterIdContacts**](docs/ContactsApi.md#getcharacterscharacteridcontacts) | **GET** /characters/{character_id}/contacts/ | Get contacts
*ContactsApi* | [**getCharactersCharacterIdContactsLabels**](docs/ContactsApi.md#getcharacterscharacteridcontactslabels) | **GET** /characters/{character_id}/contacts/labels/ | Get contact labels
*ContactsApi* | [**getCorporationsCorporationIdContacts**](docs/ContactsApi.md#getcorporationscorporationidcontacts) | **GET** /corporations/{corporation_id}/contacts/ | Get corporation contacts
*ContactsApi* | [**postCharactersCharacterIdContacts**](docs/ContactsApi.md#postcharacterscharacteridcontacts) | **POST** /characters/{character_id}/contacts/ | Add contacts
*ContactsApi* | [**putCharactersCharacterIdContacts**](docs/ContactsApi.md#putcharacterscharacteridcontacts) | **PUT** /characters/{character_id}/contacts/ | Edit contacts
*ContractsApi* | [**getCharactersCharacterIdContracts**](docs/ContractsApi.md#getcharacterscharacteridcontracts) | **GET** /characters/{character_id}/contracts/ | Get contracts
*ContractsApi* | [**getCharactersCharacterIdContractsContractIdBids**](docs/ContractsApi.md#getcharacterscharacteridcontractscontractidbids) | **GET** /characters/{character_id}/contracts/{contract_id}/bids/ | Get contract bids
*ContractsApi* | [**getCharactersCharacterIdContractsContractIdItems**](docs/ContractsApi.md#getcharacterscharacteridcontractscontractiditems) | **GET** /characters/{character_id}/contracts/{contract_id}/items/ | Get contract items
*ContractsApi* | [**getCorporationsCorporationIdContracts**](docs/ContractsApi.md#getcorporationscorporationidcontracts) | **GET** /corporations/{corporation_id}/contracts/ | Get coporation contracts
*ContractsApi* | [**getCorporationsCorporationIdContractsContractIdBids**](docs/ContractsApi.md#getcorporationscorporationidcontractscontractidbids) | **GET** /corporations/{corporation_id}/contracts/{contract_id}/bids/ | Get corporation contract bids
*ContractsApi* | [**getCorporationsCorporationIdContractsContractIdItems**](docs/ContractsApi.md#getcorporationscorporationidcontractscontractiditems) | **GET** /corporations/{corporation_id}/contracts/{contract_id}/items/ | Get corporation contract items
*CorporationApi* | [**getCorporationsCorporationId**](docs/CorporationApi.md#getcorporationscorporationid) | **GET** /corporations/{corporation_id}/ | Get corporation information
*CorporationApi* | [**getCorporationsCorporationIdAlliancehistory**](docs/CorporationApi.md#getcorporationscorporationidalliancehistory) | **GET** /corporations/{corporation_id}/alliancehistory/ | Get alliance history
*CorporationApi* | [**getCorporationsCorporationIdBlueprints**](docs/CorporationApi.md#getcorporationscorporationidblueprints) | **GET** /corporations/{corporation_id}/blueprints/ | Get corporation blueprints
*CorporationApi* | [**getCorporationsCorporationIdContainersLogs**](docs/CorporationApi.md#getcorporationscorporationidcontainerslogs) | **GET** /corporations/{corporation_id}/containers/logs/ | Get all corporation ALSC logs
*CorporationApi* | [**getCorporationsCorporationIdDivisions**](docs/CorporationApi.md#getcorporationscorporationiddivisions) | **GET** /corporations/{corporation_id}/divisions/ | Get corporation divisions
*CorporationApi* | [**getCorporationsCorporationIdFacilities**](docs/CorporationApi.md#getcorporationscorporationidfacilities) | **GET** /corporations/{corporation_id}/facilities/ | Get corporation facilities
*CorporationApi* | [**getCorporationsCorporationIdIcons**](docs/CorporationApi.md#getcorporationscorporationidicons) | **GET** /corporations/{corporation_id}/icons/ | Get corporation icon
*CorporationApi* | [**getCorporationsCorporationIdMedals**](docs/CorporationApi.md#getcorporationscorporationidmedals) | **GET** /corporations/{corporation_id}/medals/ | Get corporation medals
*CorporationApi* | [**getCorporationsCorporationIdMedalsIssued**](docs/CorporationApi.md#getcorporationscorporationidmedalsissued) | **GET** /corporations/{corporation_id}/medals/issued/ | Get corporation issued medals
*CorporationApi* | [**getCorporationsCorporationIdMembers**](docs/CorporationApi.md#getcorporationscorporationidmembers) | **GET** /corporations/{corporation_id}/members/ | Get corporation members
*CorporationApi* | [**getCorporationsCorporationIdMembersLimit**](docs/CorporationApi.md#getcorporationscorporationidmemberslimit) | **GET** /corporations/{corporation_id}/members/limit/ | Get corporation member limit
*CorporationApi* | [**getCorporationsCorporationIdMembersTitles**](docs/CorporationApi.md#getcorporationscorporationidmemberstitles) | **GET** /corporations/{corporation_id}/members/titles/ | Get corporation's members' titles
*CorporationApi* | [**getCorporationsCorporationIdMembertracking**](docs/CorporationApi.md#getcorporationscorporationidmembertracking) | **GET** /corporations/{corporation_id}/membertracking/ | Track corporation members
*CorporationApi* | [**getCorporationsCorporationIdOutposts**](docs/CorporationApi.md#getcorporationscorporationidoutposts) | **GET** /corporations/{corporation_id}/outposts/ | Get corporation outposts
*CorporationApi* | [**getCorporationsCorporationIdOutpostsOutpostId**](docs/CorporationApi.md#getcorporationscorporationidoutpostsoutpostid) | **GET** /corporations/{corporation_id}/outposts/{outpost_id}/ | Get corporation outpost details
*CorporationApi* | [**getCorporationsCorporationIdRoles**](docs/CorporationApi.md#getcorporationscorporationidroles) | **GET** /corporations/{corporation_id}/roles/ | Get corporation member roles
*CorporationApi* | [**getCorporationsCorporationIdRolesHistory**](docs/CorporationApi.md#getcorporationscorporationidroleshistory) | **GET** /corporations/{corporation_id}/roles/history/ | Get corporation member roles history
*CorporationApi* | [**getCorporationsCorporationIdShareholders**](docs/CorporationApi.md#getcorporationscorporationidshareholders) | **GET** /corporations/{corporation_id}/shareholders/ | Get corporation members
*CorporationApi* | [**getCorporationsCorporationIdStandings**](docs/CorporationApi.md#getcorporationscorporationidstandings) | **GET** /corporations/{corporation_id}/standings/ | Get corporation standings
*CorporationApi* | [**getCorporationsCorporationIdStarbases**](docs/CorporationApi.md#getcorporationscorporationidstarbases) | **GET** /corporations/{corporation_id}/starbases/ | Get corporation starbases (POSes)
*CorporationApi* | [**getCorporationsCorporationIdStarbasesStarbaseId**](docs/CorporationApi.md#getcorporationscorporationidstarbasesstarbaseid) | **GET** /corporations/{corporation_id}/starbases/{starbase_id}/ | Get starbase (POS) detail
*CorporationApi* | [**getCorporationsCorporationIdStructures**](docs/CorporationApi.md#getcorporationscorporationidstructures) | **GET** /corporations/{corporation_id}/structures/ | Get corporation structures
*CorporationApi* | [**getCorporationsCorporationIdTitles**](docs/CorporationApi.md#getcorporationscorporationidtitles) | **GET** /corporations/{corporation_id}/titles/ | Get corporation titles
*CorporationApi* | [**getCorporationsNames**](docs/CorporationApi.md#getcorporationsnames) | **GET** /corporations/names/ | Get corporation names
*CorporationApi* | [**getCorporationsNpccorps**](docs/CorporationApi.md#getcorporationsnpccorps) | **GET** /corporations/npccorps/ | Get npc corporations
*CorporationApi* | [**putCorporationsCorporationIdStructuresStructureId**](docs/CorporationApi.md#putcorporationscorporationidstructuresstructureid) | **PUT** /corporations/{corporation_id}/structures/{structure_id}/ | Update structure vulnerability schedule
*DogmaApi* | [**getDogmaAttributes**](docs/DogmaApi.md#getdogmaattributes) | **GET** /dogma/attributes/ | Get attributes
*DogmaApi* | [**getDogmaAttributesAttributeId**](docs/DogmaApi.md#getdogmaattributesattributeid) | **GET** /dogma/attributes/{attribute_id}/ | Get attribute information
*DogmaApi* | [**getDogmaEffects**](docs/DogmaApi.md#getdogmaeffects) | **GET** /dogma/effects/ | Get effects
*DogmaApi* | [**getDogmaEffectsEffectId**](docs/DogmaApi.md#getdogmaeffectseffectid) | **GET** /dogma/effects/{effect_id}/ | Get effect information
*FactionWarfareApi* | [**getCharactersCharacterIdFwStats**](docs/FactionWarfareApi.md#getcharacterscharacteridfwstats) | **GET** /characters/{character_id}/fw/stats/ | Overview of a character involved in faction warfare
*FactionWarfareApi* | [**getCorporationsCorporationIdFwStats**](docs/FactionWarfareApi.md#getcorporationscorporationidfwstats) | **GET** /corporations/{corporation_id}/fw/stats/ | Overview of a corporation involved in faction warfare
*FactionWarfareApi* | [**getFwLeaderboards**](docs/FactionWarfareApi.md#getfwleaderboards) | **GET** /fw/leaderboards/ | List of the top factions in faction warfare
*FactionWarfareApi* | [**getFwLeaderboardsCharacters**](docs/FactionWarfareApi.md#getfwleaderboardscharacters) | **GET** /fw/leaderboards/characters/ | List of the top pilots in faction warfare
*FactionWarfareApi* | [**getFwLeaderboardsCorporations**](docs/FactionWarfareApi.md#getfwleaderboardscorporations) | **GET** /fw/leaderboards/corporations/ | List of the top corporations in faction warfare
*FactionWarfareApi* | [**getFwStats**](docs/FactionWarfareApi.md#getfwstats) | **GET** /fw/stats/ | An overview of statistics about factions involved in faction warfare
*FactionWarfareApi* | [**getFwSystems**](docs/FactionWarfareApi.md#getfwsystems) | **GET** /fw/systems/ | Ownership of faction warfare systems
*FactionWarfareApi* | [**getFwWars**](docs/FactionWarfareApi.md#getfwwars) | **GET** /fw/wars/ | Data about which NPC factions are at war
*FittingsApi* | [**deleteCharactersCharacterIdFittingsFittingId**](docs/FittingsApi.md#deletecharacterscharacteridfittingsfittingid) | **DELETE** /characters/{character_id}/fittings/{fitting_id}/ | Delete fitting
*FittingsApi* | [**getCharactersCharacterIdFittings**](docs/FittingsApi.md#getcharacterscharacteridfittings) | **GET** /characters/{character_id}/fittings/ | Get fittings
*FittingsApi* | [**postCharactersCharacterIdFittings**](docs/FittingsApi.md#postcharacterscharacteridfittings) | **POST** /characters/{character_id}/fittings/ | Create fitting
*FleetsApi* | [**deleteFleetsFleetIdMembersMemberId**](docs/FleetsApi.md#deletefleetsfleetidmembersmemberid) | **DELETE** /fleets/{fleet_id}/members/{member_id}/ | Kick fleet member
*FleetsApi* | [**deleteFleetsFleetIdSquadsSquadId**](docs/FleetsApi.md#deletefleetsfleetidsquadssquadid) | **DELETE** /fleets/{fleet_id}/squads/{squad_id}/ | Delete fleet squad
*FleetsApi* | [**deleteFleetsFleetIdWingsWingId**](docs/FleetsApi.md#deletefleetsfleetidwingswingid) | **DELETE** /fleets/{fleet_id}/wings/{wing_id}/ | Delete fleet wing
*FleetsApi* | [**getCharactersCharacterIdFleet**](docs/FleetsApi.md#getcharacterscharacteridfleet) | **GET** /characters/{character_id}/fleet/ | Get character fleet info
*FleetsApi* | [**getFleetsFleetId**](docs/FleetsApi.md#getfleetsfleetid) | **GET** /fleets/{fleet_id}/ | Get fleet information
*FleetsApi* | [**getFleetsFleetIdMembers**](docs/FleetsApi.md#getfleetsfleetidmembers) | **GET** /fleets/{fleet_id}/members/ | Get fleet members
*FleetsApi* | [**getFleetsFleetIdWings**](docs/FleetsApi.md#getfleetsfleetidwings) | **GET** /fleets/{fleet_id}/wings/ | Get fleet wings
*FleetsApi* | [**postFleetsFleetIdMembers**](docs/FleetsApi.md#postfleetsfleetidmembers) | **POST** /fleets/{fleet_id}/members/ | Create fleet invitation
*FleetsApi* | [**postFleetsFleetIdWings**](docs/FleetsApi.md#postfleetsfleetidwings) | **POST** /fleets/{fleet_id}/wings/ | Create fleet wing
*FleetsApi* | [**postFleetsFleetIdWingsWingIdSquads**](docs/FleetsApi.md#postfleetsfleetidwingswingidsquads) | **POST** /fleets/{fleet_id}/wings/{wing_id}/squads/ | Create fleet squad
*FleetsApi* | [**putFleetsFleetId**](docs/FleetsApi.md#putfleetsfleetid) | **PUT** /fleets/{fleet_id}/ | Update fleet
*FleetsApi* | [**putFleetsFleetIdMembersMemberId**](docs/FleetsApi.md#putfleetsfleetidmembersmemberid) | **PUT** /fleets/{fleet_id}/members/{member_id}/ | Move fleet member
*FleetsApi* | [**putFleetsFleetIdSquadsSquadId**](docs/FleetsApi.md#putfleetsfleetidsquadssquadid) | **PUT** /fleets/{fleet_id}/squads/{squad_id}/ | Rename fleet squad
*FleetsApi* | [**putFleetsFleetIdWingsWingId**](docs/FleetsApi.md#putfleetsfleetidwingswingid) | **PUT** /fleets/{fleet_id}/wings/{wing_id}/ | Rename fleet wing
*IncursionsApi* | [**getIncursions**](docs/IncursionsApi.md#getincursions) | **GET** /incursions/ | List incursions
*IndustryApi* | [**getCharactersCharacterIdIndustryJobs**](docs/IndustryApi.md#getcharacterscharacteridindustryjobs) | **GET** /characters/{character_id}/industry/jobs/ | List character industry jobs
*IndustryApi* | [**getCharactersCharacterIdMining**](docs/IndustryApi.md#getcharacterscharacteridmining) | **GET** /characters/{character_id}/mining/ | Character mining ledger
*IndustryApi* | [**getCorporationCorporationIdMiningExtractions**](docs/IndustryApi.md#getcorporationcorporationidminingextractions) | **GET** /corporation/{corporation_id}/mining/extractions/ | Moon extraction timers
*IndustryApi* | [**getCorporationCorporationIdMiningObservers**](docs/IndustryApi.md#getcorporationcorporationidminingobservers) | **GET** /corporation/{corporation_id}/mining/observers/ | Corporation mining observers
*IndustryApi* | [**getCorporationCorporationIdMiningObserversObserverId**](docs/IndustryApi.md#getcorporationcorporationidminingobserversobserverid) | **GET** /corporation/{corporation_id}/mining/observers/{observer_id}/ | Observed corporation mining
*IndustryApi* | [**getCorporationsCorporationIdIndustryJobs**](docs/IndustryApi.md#getcorporationscorporationidindustryjobs) | **GET** /corporations/{corporation_id}/industry/jobs/ | List corporation industry jobs
*IndustryApi* | [**getIndustryFacilities**](docs/IndustryApi.md#getindustryfacilities) | **GET** /industry/facilities/ | List industry facilities
*IndustryApi* | [**getIndustrySystems**](docs/IndustryApi.md#getindustrysystems) | **GET** /industry/systems/ | List solar system cost indices
*InsuranceApi* | [**getInsurancePrices**](docs/InsuranceApi.md#getinsuranceprices) | **GET** /insurance/prices/ | List insurance levels
*KillmailsApi* | [**getCharactersCharacterIdKillmailsRecent**](docs/KillmailsApi.md#getcharacterscharacteridkillmailsrecent) | **GET** /characters/{character_id}/killmails/recent/ | Get character kills and losses
*KillmailsApi* | [**getCorporationsCorporationIdKillmailsRecent**](docs/KillmailsApi.md#getcorporationscorporationidkillmailsrecent) | **GET** /corporations/{corporation_id}/killmails/recent/ | Get corporation kills and losses
*KillmailsApi* | [**getKillmailsKillmailIdKillmailHash**](docs/KillmailsApi.md#getkillmailskillmailidkillmailhash) | **GET** /killmails/{killmail_id}/{killmail_hash}/ | Get a single killmail
*LocationApi* | [**getCharactersCharacterIdLocation**](docs/LocationApi.md#getcharacterscharacteridlocation) | **GET** /characters/{character_id}/location/ | Get character location
*LocationApi* | [**getCharactersCharacterIdOnline**](docs/LocationApi.md#getcharacterscharacteridonline) | **GET** /characters/{character_id}/online/ | Get character online
*LocationApi* | [**getCharactersCharacterIdShip**](docs/LocationApi.md#getcharacterscharacteridship) | **GET** /characters/{character_id}/ship/ | Get current ship
*LoyaltyApi* | [**getCharactersCharacterIdLoyaltyPoints**](docs/LoyaltyApi.md#getcharacterscharacteridloyaltypoints) | **GET** /characters/{character_id}/loyalty/points/ | Get loyalty points
*LoyaltyApi* | [**getLoyaltyStoresCorporationIdOffers**](docs/LoyaltyApi.md#getloyaltystorescorporationidoffers) | **GET** /loyalty/stores/{corporation_id}/offers/ | List loyalty store offers
*MailApi* | [**deleteCharactersCharacterIdMailLabelsLabelId**](docs/MailApi.md#deletecharacterscharacteridmaillabelslabelid) | **DELETE** /characters/{character_id}/mail/labels/{label_id}/ | Delete a mail label
*MailApi* | [**deleteCharactersCharacterIdMailMailId**](docs/MailApi.md#deletecharacterscharacteridmailmailid) | **DELETE** /characters/{character_id}/mail/{mail_id}/ | Delete a mail
*MailApi* | [**getCharactersCharacterIdMail**](docs/MailApi.md#getcharacterscharacteridmail) | **GET** /characters/{character_id}/mail/ | Return mail headers
*MailApi* | [**getCharactersCharacterIdMailLabels**](docs/MailApi.md#getcharacterscharacteridmaillabels) | **GET** /characters/{character_id}/mail/labels/ | Get mail labels and unread counts
*MailApi* | [**getCharactersCharacterIdMailLists**](docs/MailApi.md#getcharacterscharacteridmaillists) | **GET** /characters/{character_id}/mail/lists/ | Return mailing list subscriptions
*MailApi* | [**getCharactersCharacterIdMailMailId**](docs/MailApi.md#getcharacterscharacteridmailmailid) | **GET** /characters/{character_id}/mail/{mail_id}/ | Return a mail
*MailApi* | [**postCharactersCharacterIdMail**](docs/MailApi.md#postcharacterscharacteridmail) | **POST** /characters/{character_id}/mail/ | Send a new mail
*MailApi* | [**postCharactersCharacterIdMailLabels**](docs/MailApi.md#postcharacterscharacteridmaillabels) | **POST** /characters/{character_id}/mail/labels/ | Create a mail label
*MailApi* | [**putCharactersCharacterIdMailMailId**](docs/MailApi.md#putcharacterscharacteridmailmailid) | **PUT** /characters/{character_id}/mail/{mail_id}/ | Update metadata about a mail
*MarketApi* | [**getCharactersCharacterIdOrders**](docs/MarketApi.md#getcharacterscharacteridorders) | **GET** /characters/{character_id}/orders/ | List orders from a character
*MarketApi* | [**getCorporationsCorporationIdOrders**](docs/MarketApi.md#getcorporationscorporationidorders) | **GET** /corporations/{corporation_id}/orders/ | List orders from a corporation
*MarketApi* | [**getMarketsGroups**](docs/MarketApi.md#getmarketsgroups) | **GET** /markets/groups/ | Get item groups
*MarketApi* | [**getMarketsGroupsMarketGroupId**](docs/MarketApi.md#getmarketsgroupsmarketgroupid) | **GET** /markets/groups/{market_group_id}/ | Get item group information
*MarketApi* | [**getMarketsPrices**](docs/MarketApi.md#getmarketsprices) | **GET** /markets/prices/ | List market prices
*MarketApi* | [**getMarketsRegionIdHistory**](docs/MarketApi.md#getmarketsregionidhistory) | **GET** /markets/{region_id}/history/ | List historical market statistics in a region
*MarketApi* | [**getMarketsRegionIdOrders**](docs/MarketApi.md#getmarketsregionidorders) | **GET** /markets/{region_id}/orders/ | List orders in a region
*MarketApi* | [**getMarketsRegionIdTypes**](docs/MarketApi.md#getmarketsregionidtypes) | **GET** /markets/{region_id}/types/ | List type IDs relevant to a market
*MarketApi* | [**getMarketsStructuresStructureId**](docs/MarketApi.md#getmarketsstructuresstructureid) | **GET** /markets/structures/{structure_id}/ | List orders in a structure
*OpportunitiesApi* | [**getCharactersCharacterIdOpportunities**](docs/OpportunitiesApi.md#getcharacterscharacteridopportunities) | **GET** /characters/{character_id}/opportunities/ | Get a character's completed tasks
*OpportunitiesApi* | [**getOpportunitiesGroups**](docs/OpportunitiesApi.md#getopportunitiesgroups) | **GET** /opportunities/groups/ | Get opportunities groups
*OpportunitiesApi* | [**getOpportunitiesGroupsGroupId**](docs/OpportunitiesApi.md#getopportunitiesgroupsgroupid) | **GET** /opportunities/groups/{group_id}/ | Get opportunities group
*OpportunitiesApi* | [**getOpportunitiesTasks**](docs/OpportunitiesApi.md#getopportunitiestasks) | **GET** /opportunities/tasks/ | Get opportunities tasks
*OpportunitiesApi* | [**getOpportunitiesTasksTaskId**](docs/OpportunitiesApi.md#getopportunitiestaskstaskid) | **GET** /opportunities/tasks/{task_id}/ | Get opportunities task
*PlanetaryInteractionApi* | [**getCharactersCharacterIdPlanets**](docs/PlanetaryInteractionApi.md#getcharacterscharacteridplanets) | **GET** /characters/{character_id}/planets/ | Get colonies
*PlanetaryInteractionApi* | [**getCharactersCharacterIdPlanetsPlanetId**](docs/PlanetaryInteractionApi.md#getcharacterscharacteridplanetsplanetid) | **GET** /characters/{character_id}/planets/{planet_id}/ | Get colony layout
*PlanetaryInteractionApi* | [**getCorporationsCorporationIdCustomsOffices**](docs/PlanetaryInteractionApi.md#getcorporationscorporationidcustomsoffices) | **GET** /corporations/{corporation_id}/customs_offices/ | List corporation customs offices
*PlanetaryInteractionApi* | [**getUniverseSchematicsSchematicId**](docs/PlanetaryInteractionApi.md#getuniverseschematicsschematicid) | **GET** /universe/schematics/{schematic_id}/ | Get schematic information
*RoutesApi* | [**getRouteOriginDestination**](docs/RoutesApi.md#getrouteorigindestination) | **GET** /route/{origin}/{destination}/ | Get route
*SearchApi* | [**getCharactersCharacterIdSearch**](docs/SearchApi.md#getcharacterscharacteridsearch) | **GET** /characters/{character_id}/search/ | Search on a string
*SearchApi* | [**getSearch**](docs/SearchApi.md#getsearch) | **GET** /search/ | Search on a string
*SkillsApi* | [**getCharactersCharacterIdAttributes**](docs/SkillsApi.md#getcharacterscharacteridattributes) | **GET** /characters/{character_id}/attributes/ | Get character attributes
*SkillsApi* | [**getCharactersCharacterIdSkillqueue**](docs/SkillsApi.md#getcharacterscharacteridskillqueue) | **GET** /characters/{character_id}/skillqueue/ | Get character's skill queue
*SkillsApi* | [**getCharactersCharacterIdSkills**](docs/SkillsApi.md#getcharacterscharacteridskills) | **GET** /characters/{character_id}/skills/ | Get character skills
*SovereigntyApi* | [**getSovereigntyCampaigns**](docs/SovereigntyApi.md#getsovereigntycampaigns) | **GET** /sovereignty/campaigns/ | List sovereignty campaigns
*SovereigntyApi* | [**getSovereigntyMap**](docs/SovereigntyApi.md#getsovereigntymap) | **GET** /sovereignty/map/ | List sovereignty of systems
*SovereigntyApi* | [**getSovereigntyStructures**](docs/SovereigntyApi.md#getsovereigntystructures) | **GET** /sovereignty/structures/ | List sovereignty structures
*StatusApi* | [**getStatus**](docs/StatusApi.md#getstatus) | **GET** /status/ | Retrieve the uptime and player counts
*UniverseApi* | [**getUniverseBloodlines**](docs/UniverseApi.md#getuniversebloodlines) | **GET** /universe/bloodlines/ | Get bloodlines
*UniverseApi* | [**getUniverseCategories**](docs/UniverseApi.md#getuniversecategories) | **GET** /universe/categories/ | Get item categories
*UniverseApi* | [**getUniverseCategoriesCategoryId**](docs/UniverseApi.md#getuniversecategoriescategoryid) | **GET** /universe/categories/{category_id}/ | Get item category information
*UniverseApi* | [**getUniverseConstellations**](docs/UniverseApi.md#getuniverseconstellations) | **GET** /universe/constellations/ | Get constellations
*UniverseApi* | [**getUniverseConstellationsConstellationId**](docs/UniverseApi.md#getuniverseconstellationsconstellationid) | **GET** /universe/constellations/{constellation_id}/ | Get constellation information
*UniverseApi* | [**getUniverseFactions**](docs/UniverseApi.md#getuniversefactions) | **GET** /universe/factions/ | Get factions
*UniverseApi* | [**getUniverseGraphics**](docs/UniverseApi.md#getuniversegraphics) | **GET** /universe/graphics/ | Get graphics
*UniverseApi* | [**getUniverseGraphicsGraphicId**](docs/UniverseApi.md#getuniversegraphicsgraphicid) | **GET** /universe/graphics/{graphic_id}/ | Get graphic information
*UniverseApi* | [**getUniverseGroups**](docs/UniverseApi.md#getuniversegroups) | **GET** /universe/groups/ | Get item groups
*UniverseApi* | [**getUniverseGroupsGroupId**](docs/UniverseApi.md#getuniversegroupsgroupid) | **GET** /universe/groups/{group_id}/ | Get item group information
*UniverseApi* | [**getUniverseMoonsMoonId**](docs/UniverseApi.md#getuniversemoonsmoonid) | **GET** /universe/moons/{moon_id}/ | Get moon information
*UniverseApi* | [**getUniversePlanetsPlanetId**](docs/UniverseApi.md#getuniverseplanetsplanetid) | **GET** /universe/planets/{planet_id}/ | Get planet information
*UniverseApi* | [**getUniverseRaces**](docs/UniverseApi.md#getuniverseraces) | **GET** /universe/races/ | Get character races
*UniverseApi* | [**getUniverseRegions**](docs/UniverseApi.md#getuniverseregions) | **GET** /universe/regions/ | Get regions
*UniverseApi* | [**getUniverseRegionsRegionId**](docs/UniverseApi.md#getuniverseregionsregionid) | **GET** /universe/regions/{region_id}/ | Get region information
*UniverseApi* | [**getUniverseStargatesStargateId**](docs/UniverseApi.md#getuniversestargatesstargateid) | **GET** /universe/stargates/{stargate_id}/ | Get stargate information
*UniverseApi* | [**getUniverseStarsStarId**](docs/UniverseApi.md#getuniversestarsstarid) | **GET** /universe/stars/{star_id}/ | Get star information
*UniverseApi* | [**getUniverseStationsStationId**](docs/UniverseApi.md#getuniversestationsstationid) | **GET** /universe/stations/{station_id}/ | Get station information
*UniverseApi* | [**getUniverseStructures**](docs/UniverseApi.md#getuniversestructures) | **GET** /universe/structures/ | List all public structures
*UniverseApi* | [**getUniverseStructuresStructureId**](docs/UniverseApi.md#getuniversestructuresstructureid) | **GET** /universe/structures/{structure_id}/ | Get structure information
*UniverseApi* | [**getUniverseSystemJumps**](docs/UniverseApi.md#getuniversesystemjumps) | **GET** /universe/system_jumps/ | Get system jumps
*UniverseApi* | [**getUniverseSystemKills**](docs/UniverseApi.md#getuniversesystemkills) | **GET** /universe/system_kills/ | Get system kills
*UniverseApi* | [**getUniverseSystems**](docs/UniverseApi.md#getuniversesystems) | **GET** /universe/systems/ | Get solar systems
*UniverseApi* | [**getUniverseSystemsSystemId**](docs/UniverseApi.md#getuniversesystemssystemid) | **GET** /universe/systems/{system_id}/ | Get solar system information
*UniverseApi* | [**getUniverseTypes**](docs/UniverseApi.md#getuniversetypes) | **GET** /universe/types/ | Get types
*UniverseApi* | [**getUniverseTypesTypeId**](docs/UniverseApi.md#getuniversetypestypeid) | **GET** /universe/types/{type_id}/ | Get type information
*UniverseApi* | [**postUniverseIds**](docs/UniverseApi.md#postuniverseids) | **POST** /universe/ids/ | Bulk names to IDs
*UniverseApi* | [**postUniverseNames**](docs/UniverseApi.md#postuniversenames) | **POST** /universe/names/ | Get names and categories for a set of ID's
*UserInterfaceApi* | [**postUiAutopilotWaypoint**](docs/UserInterfaceApi.md#postuiautopilotwaypoint) | **POST** /ui/autopilot/waypoint/ | Set Autopilot Waypoint
*UserInterfaceApi* | [**postUiOpenwindowContract**](docs/UserInterfaceApi.md#postuiopenwindowcontract) | **POST** /ui/openwindow/contract/ | Open Contract Window
*UserInterfaceApi* | [**postUiOpenwindowInformation**](docs/UserInterfaceApi.md#postuiopenwindowinformation) | **POST** /ui/openwindow/information/ | Open Information Window
*UserInterfaceApi* | [**postUiOpenwindowMarketdetails**](docs/UserInterfaceApi.md#postuiopenwindowmarketdetails) | **POST** /ui/openwindow/marketdetails/ | Open Market Details
*UserInterfaceApi* | [**postUiOpenwindowNewmail**](docs/UserInterfaceApi.md#postuiopenwindownewmail) | **POST** /ui/openwindow/newmail/ | Open New Mail Window
*WalletApi* | [**getCharactersCharacterIdWallet**](docs/WalletApi.md#getcharacterscharacteridwallet) | **GET** /characters/{character_id}/wallet/ | Get a character's wallet balance
*WalletApi* | [**getCharactersCharacterIdWalletJournal**](docs/WalletApi.md#getcharacterscharacteridwalletjournal) | **GET** /characters/{character_id}/wallet/journal/ | Get character wallet journal
*WalletApi* | [**getCharactersCharacterIdWalletTransactions**](docs/WalletApi.md#getcharacterscharacteridwallettransactions) | **GET** /characters/{character_id}/wallet/transactions/ | Get wallet transactions
*WalletApi* | [**getCorporationsCorporationIdWallets**](docs/WalletApi.md#getcorporationscorporationidwallets) | **GET** /corporations/{corporation_id}/wallets/ | Returns a corporation's wallet balance
*WalletApi* | [**getCorporationsCorporationIdWalletsDivisionJournal**](docs/WalletApi.md#getcorporationscorporationidwalletsdivisionjournal) | **GET** /corporations/{corporation_id}/wallets/{division}/journal/ | Get corporation wallet journal
*WalletApi* | [**getCorporationsCorporationIdWalletsDivisionTransactions**](docs/WalletApi.md#getcorporationscorporationidwalletsdivisiontransactions) | **GET** /corporations/{corporation_id}/wallets/{division}/transactions/ | Get corporation wallet transactions
*WarsApi* | [**getWars**](docs/WarsApi.md#getwars) | **GET** /wars/ | List wars
*WarsApi* | [**getWarsWarId**](docs/WarsApi.md#getwarswarid) | **GET** /wars/{war_id}/ | Get war information
*WarsApi* | [**getWarsWarIdKillmails**](docs/WarsApi.md#getwarswaridkillmails) | **GET** /wars/{war_id}/killmails/ | List kills for a war


<a name="documentation-for-models"></a>
## Documentation for Models

 - [catdock.org.evenext.model.Delete_characters_character_id_mail_labels_label_id_unprocessable_entity](docs/Delete_characters_character_id_mail_labels_label_id_unprocessable_entity.md)
 - [catdock.org.evenext.model.Delete_fleets_fleet_id_members_member_id_not_found](docs/Delete_fleets_fleet_id_members_member_id_not_found.md)
 - [catdock.org.evenext.model.Delete_fleets_fleet_id_squads_squad_id_not_found](docs/Delete_fleets_fleet_id_squads_squad_id_not_found.md)
 - [catdock.org.evenext.model.Delete_fleets_fleet_id_wings_wing_id_not_found](docs/Delete_fleets_fleet_id_wings_wing_id_not_found.md)
 - [catdock.org.evenext.model.Forbidden](docs/Forbidden.md)
 - [catdock.org.evenext.model.Get_alliances_alliance_id_contacts_200_ok](docs/Get_alliances_alliance_id_contacts_200_ok.md)
 - [catdock.org.evenext.model.Get_alliances_alliance_id_icons_not_found](docs/Get_alliances_alliance_id_icons_not_found.md)
 - [catdock.org.evenext.model.Get_alliances_alliance_id_icons_ok](docs/Get_alliances_alliance_id_icons_ok.md)
 - [catdock.org.evenext.model.Get_alliances_alliance_id_not_found](docs/Get_alliances_alliance_id_not_found.md)
 - [catdock.org.evenext.model.Get_alliances_alliance_id_ok](docs/Get_alliances_alliance_id_ok.md)
 - [catdock.org.evenext.model.Get_alliances_names_200_ok](docs/Get_alliances_names_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_agents_research_200_ok](docs/Get_characters_character_id_agents_research_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_assets_200_ok](docs/Get_characters_character_id_assets_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_attributes_ok](docs/Get_characters_character_id_attributes_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_blueprints_200_ok](docs/Get_characters_character_id_blueprints_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_bookmarks_200_ok](docs/Get_characters_character_id_bookmarks_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_bookmarks_coordinates](docs/Get_characters_character_id_bookmarks_coordinates.md)
 - [catdock.org.evenext.model.Get_characters_character_id_bookmarks_folders_200_ok](docs/Get_characters_character_id_bookmarks_folders_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_bookmarks_item](docs/Get_characters_character_id_bookmarks_item.md)
 - [catdock.org.evenext.model.Get_characters_character_id_calendar_200_ok](docs/Get_characters_character_id_calendar_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_calendar_event_id_attendees_200_ok](docs/Get_characters_character_id_calendar_event_id_attendees_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_calendar_event_id_ok](docs/Get_characters_character_id_calendar_event_id_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_chat_channels_200_ok](docs/Get_characters_character_id_chat_channels_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_chat_channels_allowed](docs/Get_characters_character_id_chat_channels_allowed.md)
 - [catdock.org.evenext.model.Get_characters_character_id_chat_channels_blocked](docs/Get_characters_character_id_chat_channels_blocked.md)
 - [catdock.org.evenext.model.Get_characters_character_id_chat_channels_muted](docs/Get_characters_character_id_chat_channels_muted.md)
 - [catdock.org.evenext.model.Get_characters_character_id_chat_channels_operator](docs/Get_characters_character_id_chat_channels_operator.md)
 - [catdock.org.evenext.model.Get_characters_character_id_clones_home_location](docs/Get_characters_character_id_clones_home_location.md)
 - [catdock.org.evenext.model.Get_characters_character_id_clones_jump_clone](docs/Get_characters_character_id_clones_jump_clone.md)
 - [catdock.org.evenext.model.Get_characters_character_id_clones_ok](docs/Get_characters_character_id_clones_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_contacts_200_ok](docs/Get_characters_character_id_contacts_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_contacts_labels_200_ok](docs/Get_characters_character_id_contacts_labels_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_contracts_200_ok](docs/Get_characters_character_id_contracts_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_contracts_contract_id_bids_200_ok](docs/Get_characters_character_id_contracts_contract_id_bids_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_contracts_contract_id_items_200_ok](docs/Get_characters_character_id_contracts_contract_id_items_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_corporationhistory_200_ok](docs/Get_characters_character_id_corporationhistory_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fatigue_ok](docs/Get_characters_character_id_fatigue_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fittings_200_ok](docs/Get_characters_character_id_fittings_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fittings_item](docs/Get_characters_character_id_fittings_item.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fleet_not_found](docs/Get_characters_character_id_fleet_not_found.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fleet_ok](docs/Get_characters_character_id_fleet_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fw_stats_kills](docs/Get_characters_character_id_fw_stats_kills.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fw_stats_ok](docs/Get_characters_character_id_fw_stats_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_fw_stats_victory_points](docs/Get_characters_character_id_fw_stats_victory_points.md)
 - [catdock.org.evenext.model.Get_characters_character_id_industry_jobs_200_ok](docs/Get_characters_character_id_industry_jobs_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_killmails_recent_200_ok](docs/Get_characters_character_id_killmails_recent_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_location_ok](docs/Get_characters_character_id_location_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_loyalty_points_200_ok](docs/Get_characters_character_id_loyalty_points_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_200_ok](docs/Get_characters_character_id_mail_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_labels_label](docs/Get_characters_character_id_mail_labels_label.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_labels_ok](docs/Get_characters_character_id_mail_labels_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_lists_200_ok](docs/Get_characters_character_id_mail_lists_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_mail_id_not_found](docs/Get_characters_character_id_mail_mail_id_not_found.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_mail_id_ok](docs/Get_characters_character_id_mail_mail_id_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_mail_id_recipient](docs/Get_characters_character_id_mail_mail_id_recipient.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mail_recipient](docs/Get_characters_character_id_mail_recipient.md)
 - [catdock.org.evenext.model.Get_characters_character_id_medals_200_ok](docs/Get_characters_character_id_medals_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_medals_graphic](docs/Get_characters_character_id_medals_graphic.md)
 - [catdock.org.evenext.model.Get_characters_character_id_mining_200_ok](docs/Get_characters_character_id_mining_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_not_found](docs/Get_characters_character_id_not_found.md)
 - [catdock.org.evenext.model.Get_characters_character_id_notifications_200_ok](docs/Get_characters_character_id_notifications_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_notifications_contacts_200_ok](docs/Get_characters_character_id_notifications_contacts_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_ok](docs/Get_characters_character_id_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_online_ok](docs/Get_characters_character_id_online_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_opportunities_200_ok](docs/Get_characters_character_id_opportunities_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_orders_200_ok](docs/Get_characters_character_id_orders_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_200_ok](docs/Get_characters_character_id_planets_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_content](docs/Get_characters_character_id_planets_planet_id_content.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_extractor_details](docs/Get_characters_character_id_planets_planet_id_extractor_details.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_factory_details](docs/Get_characters_character_id_planets_planet_id_factory_details.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_head](docs/Get_characters_character_id_planets_planet_id_head.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_link](docs/Get_characters_character_id_planets_planet_id_link.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_not_found](docs/Get_characters_character_id_planets_planet_id_not_found.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_ok](docs/Get_characters_character_id_planets_planet_id_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_pin](docs/Get_characters_character_id_planets_planet_id_pin.md)
 - [catdock.org.evenext.model.Get_characters_character_id_planets_planet_id_route](docs/Get_characters_character_id_planets_planet_id_route.md)
 - [catdock.org.evenext.model.Get_characters_character_id_portrait_not_found](docs/Get_characters_character_id_portrait_not_found.md)
 - [catdock.org.evenext.model.Get_characters_character_id_portrait_ok](docs/Get_characters_character_id_portrait_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_roles_ok](docs/Get_characters_character_id_roles_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_search_ok](docs/Get_characters_character_id_search_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_ship_ok](docs/Get_characters_character_id_ship_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_skillqueue_200_ok](docs/Get_characters_character_id_skillqueue_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_skills_ok](docs/Get_characters_character_id_skills_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_skills_skill](docs/Get_characters_character_id_skills_skill.md)
 - [catdock.org.evenext.model.Get_characters_character_id_standings_200_ok](docs/Get_characters_character_id_standings_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_200_ok](docs/Get_characters_character_id_stats_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_character](docs/Get_characters_character_id_stats_character.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_combat](docs/Get_characters_character_id_stats_combat.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_industry](docs/Get_characters_character_id_stats_industry.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_inventory](docs/Get_characters_character_id_stats_inventory.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_isk](docs/Get_characters_character_id_stats_isk.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_market](docs/Get_characters_character_id_stats_market.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_mining](docs/Get_characters_character_id_stats_mining.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_module](docs/Get_characters_character_id_stats_module.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_orbital](docs/Get_characters_character_id_stats_orbital.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_pve](docs/Get_characters_character_id_stats_pve.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_social](docs/Get_characters_character_id_stats_social.md)
 - [catdock.org.evenext.model.Get_characters_character_id_stats_travel](docs/Get_characters_character_id_stats_travel.md)
 - [catdock.org.evenext.model.Get_characters_character_id_titles_200_ok](docs/Get_characters_character_id_titles_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_wallet_journal_200_ok](docs/Get_characters_character_id_wallet_journal_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_character_id_wallet_journal_extra_info](docs/Get_characters_character_id_wallet_journal_extra_info.md)
 - [catdock.org.evenext.model.Get_characters_character_id_wallet_transactions_200_ok](docs/Get_characters_character_id_wallet_transactions_200_ok.md)
 - [catdock.org.evenext.model.Get_characters_names_200_ok](docs/Get_characters_names_200_ok.md)
 - [catdock.org.evenext.model.Get_corporation_corporation_id_mining_extractions_200_ok](docs/Get_corporation_corporation_id_mining_extractions_200_ok.md)
 - [catdock.org.evenext.model.Get_corporation_corporation_id_mining_observers_200_ok](docs/Get_corporation_corporation_id_mining_observers_200_ok.md)
 - [catdock.org.evenext.model.Get_corporation_corporation_id_mining_observers_observer_id_200_ok](docs/Get_corporation_corporation_id_mining_observers_observer_id_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_alliancehistory_200_ok](docs/Get_corporations_corporation_id_alliancehistory_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_assets_200_ok](docs/Get_corporations_corporation_id_assets_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_blueprints_200_ok](docs/Get_corporations_corporation_id_blueprints_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_bookmarks_200_ok](docs/Get_corporations_corporation_id_bookmarks_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_bookmarks_coordinates](docs/Get_corporations_corporation_id_bookmarks_coordinates.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_bookmarks_folders_200_ok](docs/Get_corporations_corporation_id_bookmarks_folders_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_bookmarks_item](docs/Get_corporations_corporation_id_bookmarks_item.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_contacts_200_ok](docs/Get_corporations_corporation_id_contacts_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_containers_logs_200_ok](docs/Get_corporations_corporation_id_containers_logs_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_contracts_200_ok](docs/Get_corporations_corporation_id_contracts_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_contracts_contract_id_bids_200_ok](docs/Get_corporations_corporation_id_contracts_contract_id_bids_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_contracts_contract_id_items_200_ok](docs/Get_corporations_corporation_id_contracts_contract_id_items_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_customs_offices_200_ok](docs/Get_corporations_corporation_id_customs_offices_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_divisions_hangar](docs/Get_corporations_corporation_id_divisions_hangar.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_divisions_ok](docs/Get_corporations_corporation_id_divisions_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_divisions_wallet](docs/Get_corporations_corporation_id_divisions_wallet.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_facilities_200_ok](docs/Get_corporations_corporation_id_facilities_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_fw_stats_kills](docs/Get_corporations_corporation_id_fw_stats_kills.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_fw_stats_ok](docs/Get_corporations_corporation_id_fw_stats_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_fw_stats_victory_points](docs/Get_corporations_corporation_id_fw_stats_victory_points.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_icons_not_found](docs/Get_corporations_corporation_id_icons_not_found.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_icons_ok](docs/Get_corporations_corporation_id_icons_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_industry_jobs_200_ok](docs/Get_corporations_corporation_id_industry_jobs_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_killmails_recent_200_ok](docs/Get_corporations_corporation_id_killmails_recent_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_medals_200_ok](docs/Get_corporations_corporation_id_medals_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_medals_issued_200_ok](docs/Get_corporations_corporation_id_medals_issued_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_members_titles_200_ok](docs/Get_corporations_corporation_id_members_titles_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_membertracking_200_ok](docs/Get_corporations_corporation_id_membertracking_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_not_found](docs/Get_corporations_corporation_id_not_found.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_ok](docs/Get_corporations_corporation_id_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_orders_200_ok](docs/Get_corporations_corporation_id_orders_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_outposts_outpost_id_coordinates](docs/Get_corporations_corporation_id_outposts_outpost_id_coordinates.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_outposts_outpost_id_ok](docs/Get_corporations_corporation_id_outposts_outpost_id_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_outposts_outpost_id_service](docs/Get_corporations_corporation_id_outposts_outpost_id_service.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_roles_200_ok](docs/Get_corporations_corporation_id_roles_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_roles_history_200_ok](docs/Get_corporations_corporation_id_roles_history_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_shareholders_200_ok](docs/Get_corporations_corporation_id_shareholders_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_standings_200_ok](docs/Get_corporations_corporation_id_standings_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_starbases_200_ok](docs/Get_corporations_corporation_id_starbases_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_starbases_starbase_id_fuel](docs/Get_corporations_corporation_id_starbases_starbase_id_fuel.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_starbases_starbase_id_ok](docs/Get_corporations_corporation_id_starbases_starbase_id_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_structures_200_ok](docs/Get_corporations_corporation_id_structures_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_structures_current_vul](docs/Get_corporations_corporation_id_structures_current_vul.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_structures_next_vul](docs/Get_corporations_corporation_id_structures_next_vul.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_structures_service](docs/Get_corporations_corporation_id_structures_service.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_titles_200_ok](docs/Get_corporations_corporation_id_titles_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_wallets_200_ok](docs/Get_corporations_corporation_id_wallets_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_wallets_division_journal_200_ok](docs/Get_corporations_corporation_id_wallets_division_journal_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_wallets_division_journal_extra_info](docs/Get_corporations_corporation_id_wallets_division_journal_extra_info.md)
 - [catdock.org.evenext.model.Get_corporations_corporation_id_wallets_division_transactions_200_ok](docs/Get_corporations_corporation_id_wallets_division_transactions_200_ok.md)
 - [catdock.org.evenext.model.Get_corporations_names_200_ok](docs/Get_corporations_names_200_ok.md)
 - [catdock.org.evenext.model.Get_dogma_attributes_attribute_id_not_found](docs/Get_dogma_attributes_attribute_id_not_found.md)
 - [catdock.org.evenext.model.Get_dogma_attributes_attribute_id_ok](docs/Get_dogma_attributes_attribute_id_ok.md)
 - [catdock.org.evenext.model.Get_dogma_effects_effect_id_modifier](docs/Get_dogma_effects_effect_id_modifier.md)
 - [catdock.org.evenext.model.Get_dogma_effects_effect_id_not_found](docs/Get_dogma_effects_effect_id_not_found.md)
 - [catdock.org.evenext.model.Get_dogma_effects_effect_id_ok](docs/Get_dogma_effects_effect_id_ok.md)
 - [catdock.org.evenext.model.Get_fleets_fleet_id_members_200_ok](docs/Get_fleets_fleet_id_members_200_ok.md)
 - [catdock.org.evenext.model.Get_fleets_fleet_id_members_not_found](docs/Get_fleets_fleet_id_members_not_found.md)
 - [catdock.org.evenext.model.Get_fleets_fleet_id_not_found](docs/Get_fleets_fleet_id_not_found.md)
 - [catdock.org.evenext.model.Get_fleets_fleet_id_ok](docs/Get_fleets_fleet_id_ok.md)
 - [catdock.org.evenext.model.Get_fleets_fleet_id_wings_200_ok](docs/Get_fleets_fleet_id_wings_200_ok.md)
 - [catdock.org.evenext.model.Get_fleets_fleet_id_wings_not_found](docs/Get_fleets_fleet_id_wings_not_found.md)
 - [catdock.org.evenext.model.Get_fleets_fleet_id_wings_squad](docs/Get_fleets_fleet_id_wings_squad.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_active_total](docs/Get_fw_leaderboards_active_total.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_active_total_1](docs/Get_fw_leaderboards_active_total_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_active_total](docs/Get_fw_leaderboards_characters_active_total.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_active_total_1](docs/Get_fw_leaderboards_characters_active_total_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_kills](docs/Get_fw_leaderboards_characters_kills.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_last_week](docs/Get_fw_leaderboards_characters_last_week.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_last_week_1](docs/Get_fw_leaderboards_characters_last_week_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_ok](docs/Get_fw_leaderboards_characters_ok.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_victory_points](docs/Get_fw_leaderboards_characters_victory_points.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_yesterday](docs/Get_fw_leaderboards_characters_yesterday.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_characters_yesterday_1](docs/Get_fw_leaderboards_characters_yesterday_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_active_total](docs/Get_fw_leaderboards_corporations_active_total.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_active_total_1](docs/Get_fw_leaderboards_corporations_active_total_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_kills](docs/Get_fw_leaderboards_corporations_kills.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_last_week](docs/Get_fw_leaderboards_corporations_last_week.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_last_week_1](docs/Get_fw_leaderboards_corporations_last_week_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_ok](docs/Get_fw_leaderboards_corporations_ok.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_victory_points](docs/Get_fw_leaderboards_corporations_victory_points.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_yesterday](docs/Get_fw_leaderboards_corporations_yesterday.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_corporations_yesterday_1](docs/Get_fw_leaderboards_corporations_yesterday_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_kills](docs/Get_fw_leaderboards_kills.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_last_week](docs/Get_fw_leaderboards_last_week.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_last_week_1](docs/Get_fw_leaderboards_last_week_1.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_ok](docs/Get_fw_leaderboards_ok.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_victory_points](docs/Get_fw_leaderboards_victory_points.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_yesterday](docs/Get_fw_leaderboards_yesterday.md)
 - [catdock.org.evenext.model.Get_fw_leaderboards_yesterday_1](docs/Get_fw_leaderboards_yesterday_1.md)
 - [catdock.org.evenext.model.Get_fw_stats_200_ok](docs/Get_fw_stats_200_ok.md)
 - [catdock.org.evenext.model.Get_fw_stats_kills](docs/Get_fw_stats_kills.md)
 - [catdock.org.evenext.model.Get_fw_stats_victory_points](docs/Get_fw_stats_victory_points.md)
 - [catdock.org.evenext.model.Get_fw_systems_200_ok](docs/Get_fw_systems_200_ok.md)
 - [catdock.org.evenext.model.Get_fw_wars_200_ok](docs/Get_fw_wars_200_ok.md)
 - [catdock.org.evenext.model.Get_incursions_200_ok](docs/Get_incursions_200_ok.md)
 - [catdock.org.evenext.model.Get_industry_facilities_200_ok](docs/Get_industry_facilities_200_ok.md)
 - [catdock.org.evenext.model.Get_industry_systems_200_ok](docs/Get_industry_systems_200_ok.md)
 - [catdock.org.evenext.model.Get_industry_systems_cost_indice](docs/Get_industry_systems_cost_indice.md)
 - [catdock.org.evenext.model.Get_insurance_prices_200_ok](docs/Get_insurance_prices_200_ok.md)
 - [catdock.org.evenext.model.Get_insurance_prices_level](docs/Get_insurance_prices_level.md)
 - [catdock.org.evenext.model.Get_killmails_killmail_id_killmail_hash_attacker](docs/Get_killmails_killmail_id_killmail_hash_attacker.md)
 - [catdock.org.evenext.model.Get_killmails_killmail_id_killmail_hash_item](docs/Get_killmails_killmail_id_killmail_hash_item.md)
 - [catdock.org.evenext.model.Get_killmails_killmail_id_killmail_hash_item_1](docs/Get_killmails_killmail_id_killmail_hash_item_1.md)
 - [catdock.org.evenext.model.Get_killmails_killmail_id_killmail_hash_ok](docs/Get_killmails_killmail_id_killmail_hash_ok.md)
 - [catdock.org.evenext.model.Get_killmails_killmail_id_killmail_hash_position](docs/Get_killmails_killmail_id_killmail_hash_position.md)
 - [catdock.org.evenext.model.Get_killmails_killmail_id_killmail_hash_unprocessable_entity](docs/Get_killmails_killmail_id_killmail_hash_unprocessable_entity.md)
 - [catdock.org.evenext.model.Get_killmails_killmail_id_killmail_hash_victim](docs/Get_killmails_killmail_id_killmail_hash_victim.md)
 - [catdock.org.evenext.model.Get_loyalty_stores_corporation_id_offers_200_ok](docs/Get_loyalty_stores_corporation_id_offers_200_ok.md)
 - [catdock.org.evenext.model.Get_loyalty_stores_corporation_id_offers_required_item](docs/Get_loyalty_stores_corporation_id_offers_required_item.md)
 - [catdock.org.evenext.model.Get_markets_groups_market_group_id_not_found](docs/Get_markets_groups_market_group_id_not_found.md)
 - [catdock.org.evenext.model.Get_markets_groups_market_group_id_ok](docs/Get_markets_groups_market_group_id_ok.md)
 - [catdock.org.evenext.model.Get_markets_prices_200_ok](docs/Get_markets_prices_200_ok.md)
 - [catdock.org.evenext.model.Get_markets_region_id_history_200_ok](docs/Get_markets_region_id_history_200_ok.md)
 - [catdock.org.evenext.model.Get_markets_region_id_history_unprocessable_entity](docs/Get_markets_region_id_history_unprocessable_entity.md)
 - [catdock.org.evenext.model.Get_markets_region_id_orders_200_ok](docs/Get_markets_region_id_orders_200_ok.md)
 - [catdock.org.evenext.model.Get_markets_region_id_orders_unprocessable_entity](docs/Get_markets_region_id_orders_unprocessable_entity.md)
 - [catdock.org.evenext.model.Get_markets_structures_structure_id_200_ok](docs/Get_markets_structures_structure_id_200_ok.md)
 - [catdock.org.evenext.model.Get_opportunities_groups_group_id_ok](docs/Get_opportunities_groups_group_id_ok.md)
 - [catdock.org.evenext.model.Get_opportunities_tasks_task_id_ok](docs/Get_opportunities_tasks_task_id_ok.md)
 - [catdock.org.evenext.model.Get_route_origin_destination_not_found](docs/Get_route_origin_destination_not_found.md)
 - [catdock.org.evenext.model.Get_search_ok](docs/Get_search_ok.md)
 - [catdock.org.evenext.model.Get_sovereignty_campaigns_200_ok](docs/Get_sovereignty_campaigns_200_ok.md)
 - [catdock.org.evenext.model.Get_sovereignty_campaigns_participant](docs/Get_sovereignty_campaigns_participant.md)
 - [catdock.org.evenext.model.Get_sovereignty_map_200_ok](docs/Get_sovereignty_map_200_ok.md)
 - [catdock.org.evenext.model.Get_sovereignty_structures_200_ok](docs/Get_sovereignty_structures_200_ok.md)
 - [catdock.org.evenext.model.Get_status_ok](docs/Get_status_ok.md)
 - [catdock.org.evenext.model.Get_universe_bloodlines_200_ok](docs/Get_universe_bloodlines_200_ok.md)
 - [catdock.org.evenext.model.Get_universe_categories_category_id_not_found](docs/Get_universe_categories_category_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_categories_category_id_ok](docs/Get_universe_categories_category_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_constellations_constellation_id_not_found](docs/Get_universe_constellations_constellation_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_constellations_constellation_id_ok](docs/Get_universe_constellations_constellation_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_constellations_constellation_id_position](docs/Get_universe_constellations_constellation_id_position.md)
 - [catdock.org.evenext.model.Get_universe_factions_200_ok](docs/Get_universe_factions_200_ok.md)
 - [catdock.org.evenext.model.Get_universe_graphics_graphic_id_not_found](docs/Get_universe_graphics_graphic_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_graphics_graphic_id_ok](docs/Get_universe_graphics_graphic_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_groups_group_id_not_found](docs/Get_universe_groups_group_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_groups_group_id_ok](docs/Get_universe_groups_group_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_moons_moon_id_not_found](docs/Get_universe_moons_moon_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_moons_moon_id_ok](docs/Get_universe_moons_moon_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_moons_moon_id_position](docs/Get_universe_moons_moon_id_position.md)
 - [catdock.org.evenext.model.Get_universe_planets_planet_id_not_found](docs/Get_universe_planets_planet_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_planets_planet_id_ok](docs/Get_universe_planets_planet_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_planets_planet_id_position](docs/Get_universe_planets_planet_id_position.md)
 - [catdock.org.evenext.model.Get_universe_races_200_ok](docs/Get_universe_races_200_ok.md)
 - [catdock.org.evenext.model.Get_universe_regions_region_id_not_found](docs/Get_universe_regions_region_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_regions_region_id_ok](docs/Get_universe_regions_region_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_schematics_schematic_id_not_found](docs/Get_universe_schematics_schematic_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_schematics_schematic_id_ok](docs/Get_universe_schematics_schematic_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_stargates_stargate_id_destination](docs/Get_universe_stargates_stargate_id_destination.md)
 - [catdock.org.evenext.model.Get_universe_stargates_stargate_id_not_found](docs/Get_universe_stargates_stargate_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_stargates_stargate_id_ok](docs/Get_universe_stargates_stargate_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_stargates_stargate_id_position](docs/Get_universe_stargates_stargate_id_position.md)
 - [catdock.org.evenext.model.Get_universe_stars_star_id_ok](docs/Get_universe_stars_star_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_stations_station_id_not_found](docs/Get_universe_stations_station_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_stations_station_id_ok](docs/Get_universe_stations_station_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_stations_station_id_position](docs/Get_universe_stations_station_id_position.md)
 - [catdock.org.evenext.model.Get_universe_structures_structure_id_not_found](docs/Get_universe_structures_structure_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_structures_structure_id_ok](docs/Get_universe_structures_structure_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_structures_structure_id_position](docs/Get_universe_structures_structure_id_position.md)
 - [catdock.org.evenext.model.Get_universe_system_jumps_200_ok](docs/Get_universe_system_jumps_200_ok.md)
 - [catdock.org.evenext.model.Get_universe_system_kills_200_ok](docs/Get_universe_system_kills_200_ok.md)
 - [catdock.org.evenext.model.Get_universe_systems_system_id_not_found](docs/Get_universe_systems_system_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_systems_system_id_ok](docs/Get_universe_systems_system_id_ok.md)
 - [catdock.org.evenext.model.Get_universe_systems_system_id_planet](docs/Get_universe_systems_system_id_planet.md)
 - [catdock.org.evenext.model.Get_universe_systems_system_id_position](docs/Get_universe_systems_system_id_position.md)
 - [catdock.org.evenext.model.Get_universe_types_type_id_dogma_attribute](docs/Get_universe_types_type_id_dogma_attribute.md)
 - [catdock.org.evenext.model.Get_universe_types_type_id_dogma_effect](docs/Get_universe_types_type_id_dogma_effect.md)
 - [catdock.org.evenext.model.Get_universe_types_type_id_not_found](docs/Get_universe_types_type_id_not_found.md)
 - [catdock.org.evenext.model.Get_universe_types_type_id_ok](docs/Get_universe_types_type_id_ok.md)
 - [catdock.org.evenext.model.Get_wars_war_id_aggressor](docs/Get_wars_war_id_aggressor.md)
 - [catdock.org.evenext.model.Get_wars_war_id_ally](docs/Get_wars_war_id_ally.md)
 - [catdock.org.evenext.model.Get_wars_war_id_defender](docs/Get_wars_war_id_defender.md)
 - [catdock.org.evenext.model.Get_wars_war_id_killmails_200_ok](docs/Get_wars_war_id_killmails_200_ok.md)
 - [catdock.org.evenext.model.Get_wars_war_id_killmails_unprocessable_entity](docs/Get_wars_war_id_killmails_unprocessable_entity.md)
 - [catdock.org.evenext.model.Get_wars_war_id_ok](docs/Get_wars_war_id_ok.md)
 - [catdock.org.evenext.model.Get_wars_war_id_unprocessable_entity](docs/Get_wars_war_id_unprocessable_entity.md)
 - [catdock.org.evenext.model.Internal_server_error](docs/Internal_server_error.md)
 - [catdock.org.evenext.model.Post_characters_affiliation_200_ok](docs/Post_characters_affiliation_200_ok.md)
 - [catdock.org.evenext.model.Post_characters_affiliation_not_found](docs/Post_characters_affiliation_not_found.md)
 - [catdock.org.evenext.model.Post_characters_character_id_assets_locations_200_ok](docs/Post_characters_character_id_assets_locations_200_ok.md)
 - [catdock.org.evenext.model.Post_characters_character_id_assets_locations_position](docs/Post_characters_character_id_assets_locations_position.md)
 - [catdock.org.evenext.model.Post_characters_character_id_assets_names_200_ok](docs/Post_characters_character_id_assets_names_200_ok.md)
 - [catdock.org.evenext.model.Post_characters_character_id_fittings_created](docs/Post_characters_character_id_fittings_created.md)
 - [catdock.org.evenext.model.Post_characters_character_id_fittings_fitting](docs/Post_characters_character_id_fittings_fitting.md)
 - [catdock.org.evenext.model.Post_characters_character_id_fittings_item](docs/Post_characters_character_id_fittings_item.md)
 - [catdock.org.evenext.model.Post_characters_character_id_mail_bad_request](docs/Post_characters_character_id_mail_bad_request.md)
 - [catdock.org.evenext.model.Post_characters_character_id_mail_labels_label](docs/Post_characters_character_id_mail_labels_label.md)
 - [catdock.org.evenext.model.Post_characters_character_id_mail_mail](docs/Post_characters_character_id_mail_mail.md)
 - [catdock.org.evenext.model.Post_characters_character_id_mail_recipient](docs/Post_characters_character_id_mail_recipient.md)
 - [catdock.org.evenext.model.Post_corporations_corporation_id_assets_locations_200_ok](docs/Post_corporations_corporation_id_assets_locations_200_ok.md)
 - [catdock.org.evenext.model.Post_corporations_corporation_id_assets_locations_position](docs/Post_corporations_corporation_id_assets_locations_position.md)
 - [catdock.org.evenext.model.Post_corporations_corporation_id_assets_names_200_ok](docs/Post_corporations_corporation_id_assets_names_200_ok.md)
 - [catdock.org.evenext.model.Post_fleets_fleet_id_members_invitation](docs/Post_fleets_fleet_id_members_invitation.md)
 - [catdock.org.evenext.model.Post_fleets_fleet_id_members_not_found](docs/Post_fleets_fleet_id_members_not_found.md)
 - [catdock.org.evenext.model.Post_fleets_fleet_id_members_unprocessable_entity](docs/Post_fleets_fleet_id_members_unprocessable_entity.md)
 - [catdock.org.evenext.model.Post_fleets_fleet_id_wings_created](docs/Post_fleets_fleet_id_wings_created.md)
 - [catdock.org.evenext.model.Post_fleets_fleet_id_wings_not_found](docs/Post_fleets_fleet_id_wings_not_found.md)
 - [catdock.org.evenext.model.Post_fleets_fleet_id_wings_wing_id_squads_created](docs/Post_fleets_fleet_id_wings_wing_id_squads_created.md)
 - [catdock.org.evenext.model.Post_fleets_fleet_id_wings_wing_id_squads_not_found](docs/Post_fleets_fleet_id_wings_wing_id_squads_not_found.md)
 - [catdock.org.evenext.model.Post_ui_openwindow_newmail_new_mail](docs/Post_ui_openwindow_newmail_new_mail.md)
 - [catdock.org.evenext.model.Post_ui_openwindow_newmail_unprocessable_entity](docs/Post_ui_openwindow_newmail_unprocessable_entity.md)
 - [catdock.org.evenext.model.Post_universe_ids_agent](docs/Post_universe_ids_agent.md)
 - [catdock.org.evenext.model.Post_universe_ids_alliance](docs/Post_universe_ids_alliance.md)
 - [catdock.org.evenext.model.Post_universe_ids_character](docs/Post_universe_ids_character.md)
 - [catdock.org.evenext.model.Post_universe_ids_constellation](docs/Post_universe_ids_constellation.md)
 - [catdock.org.evenext.model.Post_universe_ids_corporation](docs/Post_universe_ids_corporation.md)
 - [catdock.org.evenext.model.Post_universe_ids_faction](docs/Post_universe_ids_faction.md)
 - [catdock.org.evenext.model.Post_universe_ids_inventory_type](docs/Post_universe_ids_inventory_type.md)
 - [catdock.org.evenext.model.Post_universe_ids_ok](docs/Post_universe_ids_ok.md)
 - [catdock.org.evenext.model.Post_universe_ids_region](docs/Post_universe_ids_region.md)
 - [catdock.org.evenext.model.Post_universe_ids_service_unavailable](docs/Post_universe_ids_service_unavailable.md)
 - [catdock.org.evenext.model.Post_universe_ids_station](docs/Post_universe_ids_station.md)
 - [catdock.org.evenext.model.Post_universe_ids_system](docs/Post_universe_ids_system.md)
 - [catdock.org.evenext.model.Post_universe_names_200_ok](docs/Post_universe_names_200_ok.md)
 - [catdock.org.evenext.model.Post_universe_names_not_found](docs/Post_universe_names_not_found.md)
 - [catdock.org.evenext.model.Put_characters_character_id_calendar_event_id_response](docs/Put_characters_character_id_calendar_event_id_response.md)
 - [catdock.org.evenext.model.Put_characters_character_id_mail_mail_id_bad_request](docs/Put_characters_character_id_mail_mail_id_bad_request.md)
 - [catdock.org.evenext.model.Put_characters_character_id_mail_mail_id_contents](docs/Put_characters_character_id_mail_mail_id_contents.md)
 - [catdock.org.evenext.model.Put_corporations_corporation_id_structures_structure_id_new_schedule](docs/Put_corporations_corporation_id_structures_structure_id_new_schedule.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_bad_request](docs/Put_fleets_fleet_id_bad_request.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_members_member_id_movement](docs/Put_fleets_fleet_id_members_member_id_movement.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_members_member_id_not_found](docs/Put_fleets_fleet_id_members_member_id_not_found.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_members_member_id_unprocessable_entity](docs/Put_fleets_fleet_id_members_member_id_unprocessable_entity.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_new_settings](docs/Put_fleets_fleet_id_new_settings.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_not_found](docs/Put_fleets_fleet_id_not_found.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_squads_squad_id_naming](docs/Put_fleets_fleet_id_squads_squad_id_naming.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_squads_squad_id_not_found](docs/Put_fleets_fleet_id_squads_squad_id_not_found.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_wings_wing_id_naming](docs/Put_fleets_fleet_id_wings_wing_id_naming.md)
 - [catdock.org.evenext.model.Put_fleets_fleet_id_wings_wing_id_not_found](docs/Put_fleets_fleet_id_wings_wing_id_not_found.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="evesso"></a>
### evesso

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://login.eveonline.com/oauth/authorize
- **Scopes**: 
  - esi-alliances.read_contacts.v1: EVE SSO scope esi-alliances.read_contacts.v1
  - esi-assets.read_assets.v1: EVE SSO scope esi-assets.read_assets.v1
  - esi-assets.read_corporation_assets.v1: EVE SSO scope esi-assets.read_corporation_assets.v1
  - esi-bookmarks.read_character_bookmarks.v1: EVE SSO scope esi-bookmarks.read_character_bookmarks.v1
  - esi-bookmarks.read_corporation_bookmarks.v1: EVE SSO scope esi-bookmarks.read_corporation_bookmarks.v1
  - esi-calendar.read_calendar_events.v1: EVE SSO scope esi-calendar.read_calendar_events.v1
  - esi-calendar.respond_calendar_events.v1: EVE SSO scope esi-calendar.respond_calendar_events.v1
  - esi-characters.read_agents_research.v1: EVE SSO scope esi-characters.read_agents_research.v1
  - esi-characters.read_blueprints.v1: EVE SSO scope esi-characters.read_blueprints.v1
  - esi-characters.read_chat_channels.v1: EVE SSO scope esi-characters.read_chat_channels.v1
  - esi-characters.read_contacts.v1: EVE SSO scope esi-characters.read_contacts.v1
  - esi-characters.read_corporation_roles.v1: EVE SSO scope esi-characters.read_corporation_roles.v1
  - esi-characters.read_fatigue.v1: EVE SSO scope esi-characters.read_fatigue.v1
  - esi-characters.read_fw_stats.v1: EVE SSO scope esi-characters.read_fw_stats.v1
  - esi-characters.read_loyalty.v1: EVE SSO scope esi-characters.read_loyalty.v1
  - esi-characters.read_medals.v1: EVE SSO scope esi-characters.read_medals.v1
  - esi-characters.read_notifications.v1: EVE SSO scope esi-characters.read_notifications.v1
  - esi-characters.read_opportunities.v1: EVE SSO scope esi-characters.read_opportunities.v1
  - esi-characters.read_standings.v1: EVE SSO scope esi-characters.read_standings.v1
  - esi-characters.read_titles.v1: EVE SSO scope esi-characters.read_titles.v1
  - esi-characters.write_contacts.v1: EVE SSO scope esi-characters.write_contacts.v1
  - esi-characterstats.read.v1: EVE SSO scope esi-characterstats.read.v1
  - esi-clones.read_clones.v1: EVE SSO scope esi-clones.read_clones.v1
  - esi-clones.read_implants.v1: EVE SSO scope esi-clones.read_implants.v1
  - esi-contracts.read_character_contracts.v1: EVE SSO scope esi-contracts.read_character_contracts.v1
  - esi-contracts.read_corporation_contracts.v1: EVE SSO scope esi-contracts.read_corporation_contracts.v1
  - esi-corporations.read_blueprints.v1: EVE SSO scope esi-corporations.read_blueprints.v1
  - esi-corporations.read_contacts.v1: EVE SSO scope esi-corporations.read_contacts.v1
  - esi-corporations.read_container_logs.v1: EVE SSO scope esi-corporations.read_container_logs.v1
  - esi-corporations.read_corporation_membership.v1: EVE SSO scope esi-corporations.read_corporation_membership.v1
  - esi-corporations.read_divisions.v1: EVE SSO scope esi-corporations.read_divisions.v1
  - esi-corporations.read_facilities.v1: EVE SSO scope esi-corporations.read_facilities.v1
  - esi-corporations.read_fw_stats.v1: EVE SSO scope esi-corporations.read_fw_stats.v1
  - esi-corporations.read_medals.v1: EVE SSO scope esi-corporations.read_medals.v1
  - esi-corporations.read_outposts.v1: EVE SSO scope esi-corporations.read_outposts.v1
  - esi-corporations.read_standings.v1: EVE SSO scope esi-corporations.read_standings.v1
  - esi-corporations.read_starbases.v1: EVE SSO scope esi-corporations.read_starbases.v1
  - esi-corporations.read_structures.v1: EVE SSO scope esi-corporations.read_structures.v1
  - esi-corporations.read_titles.v1: EVE SSO scope esi-corporations.read_titles.v1
  - esi-corporations.track_members.v1: EVE SSO scope esi-corporations.track_members.v1
  - esi-corporations.write_structures.v1: EVE SSO scope esi-corporations.write_structures.v1
  - esi-fittings.read_fittings.v1: EVE SSO scope esi-fittings.read_fittings.v1
  - esi-fittings.write_fittings.v1: EVE SSO scope esi-fittings.write_fittings.v1
  - esi-fleets.read_fleet.v1: EVE SSO scope esi-fleets.read_fleet.v1
  - esi-fleets.write_fleet.v1: EVE SSO scope esi-fleets.write_fleet.v1
  - esi-industry.read_character_jobs.v1: EVE SSO scope esi-industry.read_character_jobs.v1
  - esi-industry.read_character_mining.v1: EVE SSO scope esi-industry.read_character_mining.v1
  - esi-industry.read_corporation_jobs.v1: EVE SSO scope esi-industry.read_corporation_jobs.v1
  - esi-industry.read_corporation_mining.v1: EVE SSO scope esi-industry.read_corporation_mining.v1
  - esi-killmails.read_corporation_killmails.v1: EVE SSO scope esi-killmails.read_corporation_killmails.v1
  - esi-killmails.read_killmails.v1: EVE SSO scope esi-killmails.read_killmails.v1
  - esi-location.read_location.v1: EVE SSO scope esi-location.read_location.v1
  - esi-location.read_online.v1: EVE SSO scope esi-location.read_online.v1
  - esi-location.read_ship_type.v1: EVE SSO scope esi-location.read_ship_type.v1
  - esi-mail.organize_mail.v1: EVE SSO scope esi-mail.organize_mail.v1
  - esi-mail.read_mail.v1: EVE SSO scope esi-mail.read_mail.v1
  - esi-mail.send_mail.v1: EVE SSO scope esi-mail.send_mail.v1
  - esi-markets.read_character_orders.v1: EVE SSO scope esi-markets.read_character_orders.v1
  - esi-markets.read_corporation_orders.v1: EVE SSO scope esi-markets.read_corporation_orders.v1
  - esi-markets.structure_markets.v1: EVE SSO scope esi-markets.structure_markets.v1
  - esi-planets.manage_planets.v1: EVE SSO scope esi-planets.manage_planets.v1
  - esi-planets.read_customs_offices.v1: EVE SSO scope esi-planets.read_customs_offices.v1
  - esi-search.search_structures.v1: EVE SSO scope esi-search.search_structures.v1
  - esi-skills.read_skillqueue.v1: EVE SSO scope esi-skills.read_skillqueue.v1
  - esi-skills.read_skills.v1: EVE SSO scope esi-skills.read_skills.v1
  - esi-ui.open_window.v1: EVE SSO scope esi-ui.open_window.v1
  - esi-ui.write_waypoint.v1: EVE SSO scope esi-ui.write_waypoint.v1
  - esi-universe.read_structures.v1: EVE SSO scope esi-universe.read_structures.v1
  - esi-wallet.read_character_wallet.v1: EVE SSO scope esi-wallet.read_character_wallet.v1
  - esi-wallet.read_corporation_wallets.v1: EVE SSO scope esi-wallet.read_corporation_wallets.v1

