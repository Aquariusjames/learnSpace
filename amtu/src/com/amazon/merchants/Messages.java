/*
Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License"). You may
not use this file except in compliance with the License. A copy of the
License is located at

    http://aws.amazon.com/apache2.0/

or in the "license" file accompanying this file. This file is
distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied. See the License for the specific
language governing permissions and limitations under the License.
 */

package com.amazon.merchants;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;


public enum Messages {
    AccountManagementView_0("Access Key ID:"),
    AccountManagementView_1("Secret Key:"),
    AccountManagementView_2("Merchant ID:"),
    AccountManagementView_3("Feed Upload Interval (minutes):"),
    AccountManagementView_4("Feed Results Download Interval (minutes):"),
    AccountManagementView_5("Report Download Interval (minutes):"),
    AccountManagementView_8("Document Transport Directory:"),
    AccountManagementView_9("Browse"),
    AccountManagementView_10("Save"),
    AccountManagementView_11("Modify"),
    AccountManagementView_12("Add Account"),
    AccountManagementView_13("Test"),
    AccountManagementView_14("Delete"),
    AccountManagementView_15("Cancel"),
    AccountManagementView_16("You can retrieve your access information from the MWS registration website by clicking on the button on the right."),
    AccountManagementView_17("Open MWS Website"),
    AccountManagementView_18("Marketplace Web Service Authentication"),
    AccountManagementView_19("AMTU Account Settings"),
    AccountManagementView_20("Connection Intervals"),
    AccountManagementView_21("Please select a directory."),
    AccountManagementView_22("Error"),
    AccountManagementView_23("Saving..."),
    AccountManagementView_24("Testing..."),
    AccountManagementView_25("Successfully authenticated to the Marketplace Web Service."),
    AccountManagementView_26("Message"),
    AccountManagementView_27("Do you really wish to remove this account from AMTU?"),
    AccountManagementView_28("User Confirmation Required"),
    AccountManagementView_29("No seller account found. AMTU will now shut down."),
    AccountManagementView_30("Alert"),
    AccountManagementView_31("Disable Report Downloads for this account?"),
    AccountManagementView_32("This is the folder on your hard drive where AMTU will create the folder structure for this account."),
    AccountManagementView_33("Click here to select a different Document Transport Directory from your hard drive."),
    AccountManagementView_34("Please enter the MWS Access Key provided at the time of MWS registration."),
    AccountManagementView_35("Please enter the MWS Secret Key provided at the time of MWS registration."),
    AccountManagementView_36("Please enter the Merchant ID provided at the time of MWS registration."),
    AccountManagementView_37("Click this button to open the MWS Registration page for this account."),
    AccountManagementView_38("Enter a positive whole number; minimum value allowed: %d. This number represents how many minutes AMTU should wait between checks on this account's outgoing folders for feeds to upload to MWS."),
    AccountManagementView_39("Enter a positive whole number; minimum value allowed: %d. This number represents how many minutes AMTU should wait between requests to MWS for information on processed feeds."),
    AccountManagementView_40("Check this if you do not wish for AMTU to download reports for this account. Typically, you will not want to select this unless you have another program that downloads reports on your behalf."),
    AccountManagementView_41("Enter a positive whole number; minimum value allowed: %d. This number represents how many minutes AMTU should wait between requests to MWS for reports awaiting download."),
    AccountManagementView_42("Click here to modify information related to this AMTU account."),
    AccountManagementView_43("Click here to save the changes to this account."),
    AccountManagementView_44("Click here to remove this account from AMTU."),
    AccountManagementView_45("Click here to cancel the changes made to this account."),
    AccountManagementView_46("Click here to test the connection to MWS using this account's credentials."),
    AccountManagementView_52("Site Information"),
    AccountManagementView_53("Site Name:"),
    AccountManagementView_54("The name AMTU will use when displaying this site. Each site requires a unique display name."),
    AccountManagementView_55("Site Directory:"),
    AccountManagementView_56("The name of the directory to use for this site. Each site requires a unique directory name.<br/><br/><b>Note:</b> A folder of this name will be created under the account's Document Transport Directory."),
    AccountManagementView_59("Marketplace ID:"),
    AccountManagementView_60("The Marketplace ID associated with this site. Each site requires a unique Marketplace ID."),
    AccountManagementView_61("Click here to modify this site."),
    AccountManagementView_62("Click here to save the changes to this site."),
    AccountManagementView_63("Click here to delete this site."),
    AccountManagementView_64("Click here to cancel changes to this site."),
    AccountManagementView_65("Add Site"),
    AccountManagementView_66("Click here to register a new site to this account."),
    AccountManagementView_67("Click here to add a new account to AMTU"),
    AccountManagementView_68("Do you really wish to remove this site from this AMTU account?"),

    AccountWizardFrame_0("Steps"),
    AccountWizardFrame_1("1. Enter Account Information"),
    AccountWizardFrame_2("2. Provide MWS Credentials"),
    AccountWizardFrame_3("3. Validate Seller Account"),
    AccountWizardFrame_4("< Back"),
    AccountWizardFrame_5("Next >"),
    AccountWizardFrame_6("Cancel"),
    AccountWizardFrame_7("Add Another Account"),
    AccountWizardFrame_8("Enter a name to identify this seller account: "),
    AccountWizardFrame_10("Seller Alias is used to identify this seller within AMTU"),
    AccountWizardFrame_11("Example: Good Children (US)"),
    AccountWizardFrame_12("Choose the country in which this account is registered:"),
    AccountWizardFrame_14("Country is used to determine your Marketplace ID and MWS service URL"),
    AccountWizardFrame_15("Choose a document transport directory: "),
    AccountWizardFrame_16("Browse"),
    AccountWizardFrame_18("The AMTU folder structure will be created under the selected document transport directory. <b>Tip</b>: You may also choose an existing AMTU document transport directory from a previous installation"),
    AccountWizardFrame_19("Access Key ID:"),
    AccountWizardFrame_20("Secret Key:"),
    AccountWizardFrame_21("Merchant ID: "),
    AccountWizardFrame_23("Your Access Key ID contains up to 20 characters and may contain numbers."),
    AccountWizardFrame_24("Example:"),
    AccountWizardFrame_26("Your Secret Key contains up to 40 characters and may contain numbers."),
    AccountWizardFrame_29("Your Merchant ID contains uppercase characters and may contain numbers."),
    AccountWizardFrame_31("Feed Upload Interval (minutes): "),
    AccountWizardFrame_33("This is the minimum time in minutes between tests for feed uploads"),
    AccountWizardFrame_34("Feed Results Download Interval (minutes): "),
    AccountWizardFrame_36("This is the minimum time in minutes between checks for the results of previously uploaded feeds"),
    AccountWizardFrame_37("Report Download Interval (minutes): "),
    AccountWizardFrame_39("This is the minimum time in minutes between checks for newly available reports to download"),
    AccountWizardFrame_41("You can retrieve your access information from the MWS registration website by clicking on the button to the right"),
    AccountWizardFrame_42("Open MWS Website"),
    AccountWizardFrame_43("Seller Account Setup Wizard"),
    AccountWizardFrame_45("General Account Information"),
    AccountWizardFrame_46("MWS Authentication Credentials"),
    AccountWizardFrame_47("Connection Intervals"),
    AccountWizardFrame_48("Account Validation"),
    AccountWizardFrame_49("Welcome"),
    AccountWizardFrame_50("Authenticate"),
    AccountWizardFrame_51("Intervals"),
    AccountWizardFrame_52("Validation"),
    AccountWizardFrame_53("Validating..."),
    AccountWizardFrame_55("Error"),
    AccountWizardFrame_72("Start to validate seller account..."),
    AccountWizardFrame_77("Marketplace Web Service authentication passed"),
    AccountWizardFrame_80("Congratulations! Seller account created successfully."),
    AccountWizardFrame_82("Click Finish or Add Another Account to continue"),
    AccountWizardFrame_84("Finish"),
    AccountWizardFrame_88("Unable to authenticate to the Marketplace Web Service Server"),
    AccountWizardFrame_91("Unable to create seller account"),
    AccountWizardFrame_94("Unable to register account to logger"),
    AccountWizardFrame_98("Please select a directory."),
    AccountWizardFrame_99("Disable Report Downloads for this account?"),
    AccountWizardFrame_100("Add a Site to this Account"),
    AccountWizardFrame_101("It looks like you might be using a proxy to connect. Would you like to set that up now?"),
    AccountWizardFrame_102("Proxy Host"),
    AccountWizardFrame_103("Proxy Port"),
    AccountWizardFrame_104("Username"),
    AccountWizardFrame_105("Password"),
    AccountWizardFrame_106("Proxy Configuration"),
    AccountWizardFrame_107("Proxies"),
    AccountWizardFrame_108("The seller credentials or the proxy configuration, or both, might be incorrect; please try again."),
    AccountWizardFrame_109("The proxy configuration could not be stored; please restart AMTU and try again."),
    AccountWizardFrame_110("Your proxy host name"),
    AccountWizardFrame_111("Your HTTPS proxy port number"),
    AccountWizardFrame_112("Your proxy authentication username (if necessary)"),
    AccountWizardFrame_113("Your proxy authentication password (if necessary)"),
    AccountWizardFrame_116("The proxy host value is invalid; valid values are positive whole numbers and zero."),
    

    AddRegisteredSiteFrame_0("Add Site"),
    AddRegisteredSiteFrame_1("Use Amazon Marketplace Site"),
    AddRegisteredSiteFrame_2("Select this if you want to choose a pre-configured Amazon Marketplace Site."),
    AddRegisteredSiteFrame_3("Select one Amazon Marketplace Site from this list."),
    AddRegisteredSiteFrame_4("Use a Seller-Specific Site"),
    AddRegisteredSiteFrame_5("Select this if you want to use an Amazon Webstore, or other non-standard Marketplace ID, such as Checkout by Amazon."),
    AddRegisteredSiteFrame_6("Name for this Site"),
    AddRegisteredSiteFrame_7("Enter a name for AMTU to use when displaying this site. Each site requires a unique display name."),
    AddRegisteredSiteFrame_8("Marketplace ID"),
    AddRegisteredSiteFrame_9("Enter the Marketplace ID for this site. Each site requires a unique Marketplace ID."),
    AddRegisteredSiteFrame_10("Directory Name for this Site"),
    AddRegisteredSiteFrame_11("If you want to change the default value provided by AMTU, enter a new name for this site's directory. Each site requires a unique directory name."),
    AddRegisteredSiteFrame_12("Cancel"),
    AddRegisteredSiteFrame_13("Click here to cancel adding this site."),
    AddRegisteredSiteFrame_14("Save"),
    AddRegisteredSiteFrame_15("Click here to add this site."),
    AddRegisteredSiteFrame_16("You must choose an existing Amazon Marketplace Site from the list."),
    AddRegisteredSiteFrame_17("Successfully added new site: %s"),

    AMTUAccount_0("Unable to retrieve account information."),
    AMTUAccount_1("Invalid account XML:"),
    AMTUAccount_2("The account name attribute missing."),
    AMTUAccount_3("The MWS Access Key element is missing."),
    AMTUAccount_4("The MWS Secret Key element is missing."),
    AMTUAccount_5("The Merchant ID element is missing."),
    AMTUAccount_6("The MWS endpoint element is missing."),
    AMTUAccount_7("The MWS endpoint country code is invalid: %s"),
    AMTUAccount_8("The Document Transport Directory element is missing."),
    AMTUAccount_9("An account config element is invalid: %s"),
    AMTUAccount_10("An account config key is invalid: %s"),
    AMTUAccount_11("Feed Upload Interval is not a valid number. Please enter a number that is at least %d."),
    AMTUAccount_12("Report Download Interval is not a valid number. Please enter a number that is at least %d."),
    AMTUAccount_13("Feed Results Download Interval is not a valid number. Please enter a number that is at least %d."),
    AMTUAccount_14("A site group name attribute is missing: %s"),
    AMTUAccount_15("A site group name is invalid: %s"),
    AMTUAccount_16("Invalid site directory: %s"),
    AMTUAccount_17("A site group definition is invalid: %s"),
    AMTUAccount_18("Failed to parse configuration XML. %s"),
    AMTUAccount_19("Site group name cannot be empty."),
    AMTUAccount_20("Duplicate site group name found for this merchant: %s"),
    AMTUAccount_21("Site directory cannot be empty."),
    AMTUAccount_22("Duplicate site directory found for this merchant: %s"),
    AMTUAccount_23("Invalid site directory: %s. The name may contain only letters, numbers, and the underscore character."),
    AMTUAccount_24("Site name cannot be empty."),
    AMTUAccount_25("Duplicate site name found for this merchant: %s"),
    AMTUAccount_26("Marketplace ID cannot be empty."),
    AMTUAccount_27("Duplicate marketplace ID found for this merchant: %s"),
    AMTUAccount_28("Site Directory is too long. It can be 30 characters at most."),
    AMTUAccount_29("Site Group Name is too long. It can be 64 characters at most."),
    AMTUAccount_30("Site Name is too long. It can be 64 characters at most."),
    AMTUAccount_31("Marketplace ID is too long. It can be 32 characters at most."),

    AmazonMarketplaceSite_0("Canada - (Amazon.ca)"),
    AmazonMarketplaceSite_1("China - (Amazon.cn)"),
    AmazonMarketplaceSite_2("France - (Amazon.fr)"),
    AmazonMarketplaceSite_3("Germany - (Amazon.de)"),
    AmazonMarketplaceSite_4("Italy - (Amazon.it)"),
    AmazonMarketplaceSite_5("Japan - (Amazon.co.jp)"),
    AmazonMarketplaceSite_6("United Kingdom - (Amazon.co.uk)"),
    AmazonMarketplaceSite_7("United States - (Amazon.com)"),
    AmazonMarketplaceSite_8("Spain - (Amazon.es)"),
    AmazonMarketplaceSite_9("India - (Amazon.in)"),

    BrowserUtil_0("Action Requested"),
    BrowserUtil_1("Please open the following url in your web browser:"),

    ConfigureModel_0("Welcome to {0} version {1} Configuration Utility!"),
    ConfigureModel_1("Unrecognized parameter name: "),
    ConfigureModel_2("Please make sure that no other instances of AMTU is currently running"),
    ConfigureModel_3("Request completed with errors."),
    ConfigureModel_4("Request completed successfully."),

    ConsoleView_0("Clear Console"),

    ContentMD5HeaderCalculator_0("File %s did not match the checksum returned by the server."),

    Database_0("Driver class not found, unable to start database instance"),
    Database_1("Unable to shutdown database instance"),
    Database_2("Database instance is not started"),
    Database_3("Unable to create connection to the database "),
    Database_4("Database instance shutdown successfully"),
    Database_5("Unable to create database schema "),
    Database_6("Unable to query schema "),
    Database_7("Database instance started successfully with driver"),
    Database_8("Invalid database schema "),
    Database_9("This AMTU installation is not compatible with the local AMTU database. Please update your AMTU installation."),
    Database_10("Error communicating with the database. %s"),
    Database_11("Successfully backed up database to %s"),

    DateRange_2("Today"),
    DateRange_4("Last 3 Days"),
    DateRange_5("Last 7 Days"),
    DateRange_6("Last 30 Days"),
    DateRange_7("Last 180 Days"),

    FeedContentIdentifier_0("Cannot access file"),
    FeedContentIdentifier_1("Unable to recognize feed type"),

    FeedDispatcherTask_1("Starting to dispatch feed {0}"),
    FeedDispatcherTask_2("Unable to dispatch feed {0}"),
    FeedDispatcherTask_3("Successfully dispatched feed {0}"),
    FeedDispatcherTask_4("Unable to perform option on file {0}"),
    FeedDispatcherTask_5("Successfully stored feed {0}"),
    FeedDispatcherTask_6("Retrying dispatch of feed %s. Retry #%d of %d."),
    FeedDispatcherTask_7("Failed to execute sleep of FeedDispatcherTask thread!"),
    FeedDispatcherTask_8("Failed to dispatch feed %s. Moving to %s"),

    FeedPreprocessor_0("Unable to perform operation on file {0}"),
    FeedPreprocessor_1("Unsupported file extension: {0}."),
    FeedPreprocessor_2("If you are submitting a feed in Microsoft Excel format please make sure that you have converted it to flat text file format (.txt)."),

    FeedView_0("Filter: "),
    FeedView_1("Submitted Feeds"),
    FeedView_2("Error"),
    FeedView_3("Unable to perform UI update"),

    FileUtil_0("Failed to create temporary directory"),

    MainModel_0("Amazon Merchant Transport Utility"),
    MainModel_1("No seller account found. AMTU will now shut down."),
    MainModel_2("Shutting Down"),
    MainModel_3("Waiting for current operations to complete..."),
    MainModel_4("Do you really wish to exit AMTU? No more feeds will uploaded and no more reports will be downloaded."),
    MainModel_5("User Confirmation Required"),
    MainModel_6("Exception while creating a file lock: "),
    MainModel_7("Unable to run "),
    MainModel_8("AMTU is already running (probably the daemon)"),
    MainModel_9("Error: "),
    MainModel_10("Info: "),
    MainModel_11("Error while loading the OSXAdapter:"),
    MainModel_12("Starting {0} version {1}"),
    MainModel_13("Starting {0} version {1} as a daemon"),
    MainModel_14("Prepare to shutdown..."),
    MainModel_15("Unable to shutdown database instance"),
    MainModel_16("Successfully shutdown {0} version {1}"),

    MarketplaceWebServiceException_0("MWS responded with an error: %s"),

    MenuView_0("File"),
    MenuView_1("Edit"),
    MenuView_2("Transport"),
    MenuView_3("Help"),

    MerchantAccountManager_0("No seller account found"),
    MerchantAccountManager_1("Unable to write new account information to database"),
    MerchantAccountManager_2("Unable to create directory structure for new account"),
    MerchantAccountManager_3("Unable to update seller account information to database"),
    MerchantAccountManager_4("Unable to update directory structure for the updated account"),
    MerchantAccountManager_5("Unable to delete seller account"),
    MerchantAccountManager_6("Seller name cannot be empty"),
    MerchantAccountManager_7("Seller name is too long (maximum 64 characters)"),
    MerchantAccountManager_8("Please select the country in which the seller is registered"),
    MerchantAccountManager_9("Document Transport Directory cannot be empty"),
    MerchantAccountManager_10("Document Transport Directory is too long (maximum 1024 characters)"),
    MerchantAccountManager_11("Feed Upload Interval is less than {0}. Please enter a number that is at least {0}"),
    MerchantAccountManager_12("Report Download Interval is less than {0}. Please enter a number that is at least {0}"),
    MerchantAccountManager_13("Feed Results Download Interval is less than {0}. Please enter a number that is at least {0}"),
    MerchantAccountManager_14("Seller name already exists"),
    MerchantAccountManager_15("This Document Tranport Directory is currently assigned to another seller account"),
    MerchantAccountManager_16("Access Key ID, Secret Key, and Merchant ID fields cannot be empty"),
    MerchantAccountManager_17("An account with these MWS credentials has already been created"),
    MerchantAccountManager_18("Unable to retrieve AMTU account information"),
    MerchantAccountManager_19("Successfully added seller account"),
    MerchantAccountManager_20("Successfully updated seller account"),
    MerchantAccountManager_21("Successfully deleted seller account"),
    MerchantAccountManager_22("Unable to access database when checking alias uniqueness"),
    MerchantAccountManager_23("Unable to access database when checking credentials uniqueness"),
    MerchantAccountManager_24("Merchant ID already exists"),
    MerchantAccountManager_25("Merchant ID must be provided"),
    MerchantAccountManager_26("Document Transport Directory must point to a directory"),

    MerchantFeedQueue_0("Failed to save feed queue retrieval."),
    MerchantFeedQueue_1("Failed to save feed queue submission."),

    MerchantSiteGroup_0("Successfully updated site:"),
    MerchantSiteGroup_1("Successfully deleted site:"),

    MWSEndpoint_0("- Select Country -"),
    MWSEndpoint_1("Canada"),
    MWSEndpoint_2("China"),
    MWSEndpoint_3("France"),
    MWSEndpoint_4("Germany"),
    MWSEndpoint_5("Japan"),
    MWSEndpoint_6("United Kingdom"),
    MWSEndpoint_7("United States"),
    MWSEndpoint_8("Italy"),
    MWSEndpoint_9("Spain"),
    MWSEndpoint_10("India"),

    OSXAdapter_0("OSXAdapter could not access the About Menu"),
    OSXAdapter_1("This version of Mac OS X does not support the Apple EAWT. ApplicationEvent handling has been disabled"),
    OSXAdapter_2("Mac OS X Adapter could not talk to EAWT:"),
    OSXAdapter_3("OSXAdapter was unable to handle an ApplicationEvent: "),

    ProcReportRetrieverTask_0("Starting to retrieve processing report for feed"),
    ProcReportRetrieverTask_1("Finished retrieving processing report {0} for feed"),
    ProcReportRetrieverTask_2("Unable to store processing report"),
    ProcReportRetrieverTask_3("Unable to retrieve processing report"),
    ProcReportRetrieverTask_4("Processing report checksum error, please contact Amazon"),
    ProcReportRetrieverTask_5("Unable to write to the processing report"),

    ProxyConfig_0("The proxy configuration could not be updated; please restart AMTU and try again."),
    ProxyConfig_1("The proxy configuration could not be deleted; please restart AMTU and try again."),
    ProxyConfig_2("Successfully deleted proxy settings"),
    ProxyConfig_3("Successfully updated proxy settings"),
    ProxyConfig_4("Proxy Configuration retrieval from database failed"),
    
    ReportRetrieverTask_0("Start to retrieve report {0}"),
    ReportRetrieverTask_1("Successfully downloaded report {0}"),
    ReportRetrieverTask_2("Unable to perform options on file {0}"),
    ReportRetrieverTask_3("Report checksum error, please contact Amazon"),
    ReportRetrieverTask_4("Unable to retrieve report (Report ID: {0})"),
    ReportRetrieverTask_5("Successfully acknowledged report {0}"),
    ReportRetrieverTask_6("Unable to acknowledge report (Report ID: {0})"),
    ReportRetrieverTask_7("Successfully stored report {0}"),
    ReportRetrieverTask_8("Unable to store report (Report ID: {0})"),

    ReportTypeEnum_0("Flat File"),
    ReportTypeEnum_1("XML"),

    ReportView_0("Filter: "),
    ReportView_1("Retrieved Reports"),
    ReportView_2("Error"),
    ReportView_3("Unable to perform UI update"),

    RetrieverService_0("Detected {0,number,integer} pending report"),
    RetrieverService_1("Detected {0,number,integer} pending reports"),
    RetrieverService_2("Unable to retrieve unacknowledged report information"),

    SettingsManagementView_0("AMTU System Settings"),
    SettingsManagementView_1("Proxy Configuration"),
    SettingsManagementView_2("Proxy Host"),
    SettingsManagementView_3("Proxy Port"),
    SettingsManagementView_4("Username"),
    SettingsManagementView_5("Password"),
    SettingsManagementView_6("Your proxy host name"),
    SettingsManagementView_7("Your HTTPS proxy port number"),
    SettingsManagementView_8("Your proxy authentication username (if necessary)"),
    SettingsManagementView_9("Your proxy authentication password (if necessary)"),
    SettingsManagementView_10("Are you sure you want to remove this proxy configuration from AMTU?"),
    SettingsManagementView_11("User Confirmation Required"),
    SettingsManagementView_12("Testing..."),
    SettingsManagementView_13("Proxy test was successful"),
    SettingsManagementView_14("Message"),
    SettingsManagementView_15("Error"),
    SettingsManagementView_16("Test"),
    SettingsManagementView_17("Saving..."),
    SettingsManagementView_18("Save"),
    SettingsManagementView_19("Modify"),
    SettingsManagementView_20("Delete"),
    SettingsManagementView_21("Cancel"),
    SettingsManagementView_22("Save this proxy configuration."),
    SettingsManagementView_23("Modify the proxy configuration."),
    SettingsManagementView_24("Remove this proxy configuration from AMTU."),
    SettingsManagementView_25("Cancel unsaved changes, and keep the previous proxy configuration, if any."),
    SettingsManagementView_26("Test the proxy configuration before saving it."),
    SettingsManagementView_27("No proxy configuration exists yet."),
    SettingsManagementView_28("Alert"),
    SettingsManagementView_29("The proxy host and port values are invalid; please try again."),
    
    SideBarView_0("Select an Account to View"),
    SideBarView_1("Account Details"),
    SideBarView_2("MWS Endpoint:"),
    SideBarView_3("Document Transport Directory:"),
    SideBarView_4("Transport Status:"),
    SideBarView_5("Last Connection Established at:"),
    SideBarView_7("%d feeds in queue"),
    SideBarView_8("%d feed in queue"),
    SideBarView_9("Ready"),
    SideBarView_10("Not Available"),
    SideBarView_11("Select a Site to View"),

    StatusUpdaterService_0("Unable to retrieve pending feed information "),
    StatusUpdaterService_1("Feed has completed processing"),
    StatusUpdaterService_2("Unable to update feed status."),
    StatusUpdaterService_3("Unable to store feed status."),

    TransportConfigureUtil_0("Invalid {0} value of {1,number,integer}. Cannot be less than 0."),
    TransportConfigureUtil_1("Invalid {0} value of {1}. Value must be an integer value of at least 0."),
    TransportConfigureUtil_2("Error: file does not exist."),
    TransportConfigureUtil_4("Unable to locate manual. Please refer to the user documents."),
    TransportConfigureUtil_5("Missing parameters"),
    TransportConfigureUtil_6("Start processing Seller Account #{0,number,integer}..."),
    TransportConfigureUtil_7("Unable to print file content"),
    TransportConfigureUtil_8("%s already exists"),
    TransportConfigureUtil_9("Failed to parse account #%d."),
    TransportConfigureUtil_10("No account found matching the given alias: %s"),
    TransportConfigureUtil_11("The XML file could not be parsed; for more information see the configure.txt and proxy_sample.xml files."),
    TransportConfigureUtil_12("The proxy port value is invalid; valid values are whole numbers greater than zero."),

    TransportGuiFrame_0("Activities"),
    TransportGuiFrame_1("Submitted Feeds"),
    TransportGuiFrame_2("Retrieved Reports"),
    TransportGuiFrame_3("Account Management"),
    TransportGuiFrame_4("System Settings Management"),

    TransportGuiModel_0("Feed Name"),
    TransportGuiModel_1("Batch ID"),
    TransportGuiModel_2("Status"),
    TransportGuiModel_3("Submitted Date"),
    TransportGuiModel_4("Proc. Report"),
    TransportGuiModel_5("_RETRIEVED_"),
    TransportGuiModel_6("_PENDING_"),
    TransportGuiModel_7("n/a"),
    TransportGuiModel_8("Report Name"),
    TransportGuiModel_9("Report ID"),
    TransportGuiModel_10("Report Type"),
    TransportGuiModel_11("Retrieved Date"),
    TransportGuiModel_12("n/a"),
    TransportGuiModel_13("Unable to update GUI"),

    TransportLogger_0("Unable to delete old log files."),
    TransportLogger_1("File: "),

    TransportScheduler_0("TransportScheduler started successfully with core pool size "),
    TransportScheduler_1("TransportScheduler successfully scheduled {0} to run every {1,number,long} {2}"),
    TransportScheduler_2("TransportScheduler shutdown successfully"),

    TransportUtil_0("{0} is not a valid file"),
    TransportUtil_1("{0} is not a valid directory"),
    TransportUtil_2("Cannot rename file {0} to {1}");


    protected static final String BUNDLE_NAME = "com.amazon.merchants.messages";
    protected static final String BUNDLE_EXTENSION = "properties";

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
            .getBundle(BUNDLE_NAME, new UTF8Control()); //$NON-NLS-1$


    private String message;


    private Messages(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        try {
            return RESOURCE_BUNDLE.getString(name());
        }
        catch (MissingResourceException e) {
            return message;
        }
    }

    private static class UTF8Control extends Control {
        public ResourceBundle newBundle(String baseName, Locale locale,
                String format, ClassLoader loader, boolean reload)
                throws IllegalAccessException, InstantiationException,
                IOException {
            // The below code is copied from default Control#newBundle()
            // implementation. Only the PropertyResourceBundle line is changed
            // to read the file as UTF-8.
            String bundleName = toBundleName(baseName, locale);
            String resourceName = toResourceName(bundleName, BUNDLE_EXTENSION);
            ResourceBundle bundle = null;
            InputStream stream = null;
            if (reload) {
                URL url = loader.getResource(resourceName);
                if (url != null) {
                    URLConnection connection = url.openConnection();
                    if (connection != null) {
                        connection.setUseCaches(false);
                        stream = connection.getInputStream();
                    }
                }
            }
            else {
                stream = loader.getResourceAsStream(resourceName);
            }
            if (stream != null) {
                try {
                    bundle = new PropertyResourceBundle(new InputStreamReader(
                            stream, "UTF-8"));
                }
                finally {
                    stream.close();
                }
            }
            return bundle;
        }
    }
}