$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_LoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "Login Page Features",
  "description": "",
  "id": "login-page-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login to Admin Portal Test Scenario",
  "description": "",
  "id": "login-page-features;login-to-admin-portal-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify login to admin portal",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.verify_login_to_admin_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("02_MobileAdminPage.feature");
formatter.feature({
  "line": 2,
  "name": "Mobile Admin Page Features",
  "description": "",
  "id": "mobile-admin-page-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login to Mobile Admin Test Scenario",
  "description": "",
  "id": "mobile-admin-page-features;login-to-mobile-admin-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user close dialog box",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on policy lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on zapp portal lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify login to mobile admin portal",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileAdminSteps.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MobileAdminSteps.user_close_dialog_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MobileAdminSteps.user_clicks_on_policy_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MobileAdminSteps.user_clicks_on_zapp_portal_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MobileAdminSteps.verify_login_to_mobile_admin_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("03_AddmacOSPolicyPage.feature");
formatter.feature({
  "line": 2,
  "name": "Add Policy Page Features",
  "description": "",
  "id": "add-policy-page-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Add Mac OS Policy Test Scenario",
  "description": "",
  "id": "add-policy-page-features;add-mac-os-policy-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Add macOS Policy button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter details \"\u003cname\u003e\" \"\u003cruleOrder\u003e\" \"\u003cenable\u003e\" \"\u003cgroups\u003e\" \"\u003clogoutPassword\u003e\" \"\u003cdisablePassword\u003e\" \"\u003ccustomPACUrl\u003e\" \"\u003cforwardingProfile\u003e\" \"\u003cinstallCert\u003e\" \"\u003clogMode\u003e\" \"\u003clogFileSize\u003e\" \"\u003creactiveInternetSecurity\u003e\" \"\u003chostName\u003e\" \"\u003cz_tunnelConfig\u003e\" \"\u003cdestinationInclusions\u003e\" \"\u003cpolicyDescription\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save btn",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "add-policy-page-features;add-mac-os-policy-test-scenario;",
  "rows": [
    {
      "cells": [
        "name",
        "ruleOrder",
        "enable",
        "groups",
        "logoutPassword",
        "disablePassword",
        "customPACUrl",
        "forwardingProfile",
        "installCert",
        "logMode",
        "logFileSize",
        "reactiveInternetSecurity",
        "hostName",
        "z_tunnelConfig",
        "destinationInclusions",
        "policyDescription"
      ],
      "line": 16,
      "id": "add-policy-page-features;add-mac-os-policy-test-scenario;;1"
    },
    {
      "cells": [
        "macPolicy1",
        "Default",
        "Yes",
        "All",
        "1234",
        "1234",
        "Default",
        "Default",
        "Yes",
        "Debug",
        "100",
        "0",
        "0.0.0.0",
        "0.0.0.0",
        "0.0.0.0",
        "Mac Policy Description."
      ],
      "line": 17,
      "id": "add-policy-page-features;add-mac-os-policy-test-scenario;;2"
    },
    {
      "cells": [
        "macPolicy2",
        "Default",
        "Yes",
        "Service Admin,sync10,User Group,Executives,Managers,IT,Interns,UI,test",
        "abcd",
        "abcd",
        "Default",
        "test",
        "Yes",
        "Debug",
        "100",
        "0",
        "0.0.0.0",
        "0.0.0.0",
        "0.0.0.0",
        "Mac Policy Description."
      ],
      "line": 18,
      "id": "add-policy-page-features;add-mac-os-policy-test-scenario;;3"
    },
    {
      "cells": [
        "macPolicy3",
        "Default",
        "Yes",
        "None",
        "Default",
        "Default",
        "Default",
        "dj",
        "Yes",
        "Debug",
        "100",
        "0",
        "0.0.0.0",
        "0.0.0.0",
        "0.0.0.0",
        "Mac Policy Description."
      ],
      "line": 19,
      "id": "add-policy-page-features;add-mac-os-policy-test-scenario;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Add Mac OS Policy Test Scenario",
  "description": "",
  "id": "add-policy-page-features;add-mac-os-policy-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Add macOS Policy button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter details \"macPolicy1\" \"Default\" \"Yes\" \"All\" \"1234\" \"1234\" \"Default\" \"Default\" \"Yes\" \"Debug\" \"100\" \"0\" \"0.0.0.0\" \"0.0.0.0\" \"0.0.0.0\" \"Mac Policy Description.\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save btn",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_Add_macOS_Policy_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy1",
      "offset": 20
    },
    {
      "val": "Default",
      "offset": 33
    },
    {
      "val": "Yes",
      "offset": 43
    },
    {
      "val": "All",
      "offset": 49
    },
    {
      "val": "1234",
      "offset": 55
    },
    {
      "val": "1234",
      "offset": 62
    },
    {
      "val": "Default",
      "offset": 69
    },
    {
      "val": "Default",
      "offset": 79
    },
    {
      "val": "Yes",
      "offset": 89
    },
    {
      "val": "Debug",
      "offset": 95
    },
    {
      "val": "100",
      "offset": 103
    },
    {
      "val": "0",
      "offset": 109
    },
    {
      "val": "0.0.0.0",
      "offset": 113
    },
    {
      "val": "0.0.0.0",
      "offset": 123
    },
    {
      "val": "0.0.0.0",
      "offset": 133
    },
    {
      "val": "Mac Policy Description.",
      "offset": 143
    }
  ],
  "location": "AddmacOSPolicySteps.user_enter_details(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_save_btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Add Mac OS Policy Test Scenario",
  "description": "",
  "id": "add-policy-page-features;add-mac-os-policy-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Add macOS Policy button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter details \"macPolicy2\" \"Default\" \"Yes\" \"Service Admin,sync10,User Group,Executives,Managers,IT,Interns,UI,test\" \"abcd\" \"abcd\" \"Default\" \"test\" \"Yes\" \"Debug\" \"100\" \"0\" \"0.0.0.0\" \"0.0.0.0\" \"0.0.0.0\" \"Mac Policy Description.\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save btn",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_Add_macOS_Policy_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy2",
      "offset": 20
    },
    {
      "val": "Default",
      "offset": 33
    },
    {
      "val": "Yes",
      "offset": 43
    },
    {
      "val": "Service Admin,sync10,User Group,Executives,Managers,IT,Interns,UI,test",
      "offset": 49
    },
    {
      "val": "abcd",
      "offset": 122
    },
    {
      "val": "abcd",
      "offset": 129
    },
    {
      "val": "Default",
      "offset": 136
    },
    {
      "val": "test",
      "offset": 146
    },
    {
      "val": "Yes",
      "offset": 153
    },
    {
      "val": "Debug",
      "offset": 159
    },
    {
      "val": "100",
      "offset": 167
    },
    {
      "val": "0",
      "offset": 173
    },
    {
      "val": "0.0.0.0",
      "offset": 177
    },
    {
      "val": "0.0.0.0",
      "offset": 187
    },
    {
      "val": "0.0.0.0",
      "offset": 197
    },
    {
      "val": "Mac Policy Description.",
      "offset": 207
    }
  ],
  "location": "AddmacOSPolicySteps.user_enter_details(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_save_btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Add Mac OS Policy Test Scenario",
  "description": "",
  "id": "add-policy-page-features;add-mac-os-policy-test-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Add macOS Policy button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter details \"macPolicy3\" \"Default\" \"Yes\" \"None\" \"Default\" \"Default\" \"Default\" \"dj\" \"Yes\" \"Debug\" \"100\" \"0\" \"0.0.0.0\" \"0.0.0.0\" \"0.0.0.0\" \"Mac Policy Description.\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save btn",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_Add_macOS_Policy_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy3",
      "offset": 20
    },
    {
      "val": "Default",
      "offset": 33
    },
    {
      "val": "Yes",
      "offset": 43
    },
    {
      "val": "None",
      "offset": 49
    },
    {
      "val": "Default",
      "offset": 56
    },
    {
      "val": "Default",
      "offset": 66
    },
    {
      "val": "Default",
      "offset": 76
    },
    {
      "val": "dj",
      "offset": 86
    },
    {
      "val": "Yes",
      "offset": 91
    },
    {
      "val": "Debug",
      "offset": 97
    },
    {
      "val": "100",
      "offset": 105
    },
    {
      "val": "0",
      "offset": 111
    },
    {
      "val": "0.0.0.0",
      "offset": 115
    },
    {
      "val": "0.0.0.0",
      "offset": 125
    },
    {
      "val": "0.0.0.0",
      "offset": 135
    },
    {
      "val": "Mac Policy Description.",
      "offset": 145
    }
  ],
  "location": "AddmacOSPolicySteps.user_enter_details(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_save_btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("04_EditmacOSPolicyPage.feature");
formatter.feature({
  "line": 2,
  "name": "Edit Mac OS Policy Page Features",
  "description": "",
  "id": "edit-mac-os-policy-page-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Edit Mac OS Policy Description Test Scenario",
  "description": "",
  "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user update policy \"\u003cname\u003e\" \"\u003cpolicyDescription\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;",
  "rows": [
    {
      "cells": [
        "name",
        "policyDescription"
      ],
      "line": 16,
      "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;;1"
    },
    {
      "cells": [
        "macPolicy1",
        "Mac Policy Description Edited."
      ],
      "line": 17,
      "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;;2"
    },
    {
      "cells": [
        "macPolicy2",
        "Mac Policy Description Edited."
      ],
      "line": 18,
      "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;;3"
    },
    {
      "cells": [
        "macPolicy3",
        "Mac Policy Description Edited."
      ],
      "line": 19,
      "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Edit Mac OS Policy Description Test Scenario",
  "description": "",
  "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user update policy \"macPolicy1\" \"Mac Policy Description Edited.\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy1",
      "offset": 20
    },
    {
      "val": "Mac Policy Description Edited.",
      "offset": 33
    }
  ],
  "location": "EditmacOSPolicySteps.user_update_policy(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EditmacOSPolicySteps.user_clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Edit Mac OS Policy Description Test Scenario",
  "description": "",
  "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user update policy \"macPolicy2\" \"Mac Policy Description Edited.\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy2",
      "offset": 20
    },
    {
      "val": "Mac Policy Description Edited.",
      "offset": 33
    }
  ],
  "location": "EditmacOSPolicySteps.user_update_policy(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EditmacOSPolicySteps.user_clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Edit Mac OS Policy Description Test Scenario",
  "description": "",
  "id": "edit-mac-os-policy-page-features;edit-mac-os-policy-description-test-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user update policy \"macPolicy3\" \"Mac Policy Description Edited.\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy3",
      "offset": 20
    },
    {
      "val": "Mac Policy Description Edited.",
      "offset": 33
    }
  ],
  "location": "EditmacOSPolicySteps.user_update_policy(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EditmacOSPolicySteps.user_clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("05_DeletemacOSPolicyPage.feature");
formatter.feature({
  "line": 2,
  "name": "Delete Mac OS Policy Page Feature",
  "description": "",
  "id": "delete-mac-os-policy-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Delete Mac OS POlicy Test Scenario",
  "description": "",
  "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on delete policy btn \"\u003cname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks ok btn",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 16,
      "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;;1"
    },
    {
      "cells": [
        "macPolicy1"
      ],
      "line": 17,
      "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;;2"
    },
    {
      "cells": [
        "macPolicy2"
      ],
      "line": 18,
      "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;;3"
    },
    {
      "cells": [
        "macPolicy3"
      ],
      "line": 19,
      "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Delete Mac OS POlicy Test Scenario",
  "description": "",
  "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on delete policy btn \"macPolicy1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks ok btn",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy1",
      "offset": 34
    }
  ],
  "location": "DeletemacOSPolicySteps.user_clicks_on_delete_policy_btn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletemacOSPolicySteps.user_clicks_ok_btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Delete Mac OS POlicy Test Scenario",
  "description": "",
  "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on delete policy btn \"macPolicy2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks ok btn",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy2",
      "offset": 34
    }
  ],
  "location": "DeletemacOSPolicySteps.user_clicks_on_delete_policy_btn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletemacOSPolicySteps.user_clicks_ok_btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Delete Mac OS POlicy Test Scenario",
  "description": "",
  "id": "delete-mac-os-policy-page-feature;delete-mac-os-policy-test-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Mobile Admin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on App Profiles lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on macOS Platform Lbl",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on delete policy btn \"macPolicy3\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks ok btn",
  "keyword": "Then "
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_is_on_Mobile_Admin_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_App_Profiles_lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddmacOSPolicySteps.user_clicks_on_macOS_Platform_Lbl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "macPolicy3",
      "offset": 34
    }
  ],
  "location": "DeletemacOSPolicySteps.user_clicks_on_delete_policy_btn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletemacOSPolicySteps.user_clicks_ok_btn()"
});
formatter.result({
  "status": "skipped"
});
});