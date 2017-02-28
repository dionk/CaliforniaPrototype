package com.hotb.pgmacdesign.californiaprototype.misc;

import com.daimajia.androidanimations.library.Techniques;

/**
 * Created by pmacdowell on 2017-02-13.
 */
public class Constants {

    ///////////////////
    /////Misc Strings//
    ///////////////////

    public static final String STAGING_SERVER_URL = "ec2-54-241-144-61.us-west-1.compute.amazonaws.com";
    public static final String PHONE_URI_TO_WRITE_TO = "/storage/emulated/0/Download/";
    public static final String FILE_NAME = "debugLoggingData.txt";
    public static final String URL_GOOGLE = "https://www.google.com";
    public static final String NO_INTERNET = "It looks like you do not have a stable internet connection. Please check for connectivity and try again";

    /////////////////
    //Fragment ints//
    /////////////////

    public static final int ACTIVITY_MAIN = -10;
    public static final int ACTIVITY_ONBOARDING = -11;

    public static final int FRAGMENT_HOME = 0;
    public static final int FRAGMENT_MAP = 1;
    public static final int FRAGMENT_EMAIL_LOGIN = 2;
    public static final int FRAGMENT_SMS_VERIFICATION = 3;
    public static final int FRAGMENT_PERMISSIONS_REQUEST= 4;
    public static final int FRAGMENT_ALERT_BEACON_POPUP = 5;
    public static final int FRAGMENT_ADD_LOCATION = 6;
    public static final int FRAGMENT_ADD_CONTACT = 7;
    public static final int FRAGMENT_PROFILE = 8;
    public static final int FRAGMENT_7 = 9;
    public static final int FRAGMENT_8 = 10;

    /*
    public static final int FRAGMENT_MAP = 0;
    public static final int FRAGMENT_MAP = 0;
    public static final int FRAGMENT_MAP = 0;
    public static final int FRAGMENT_MAP = 0;
    public static final int FRAGMENT_MAP = 0;
    public static final int FRAGMENT_MAP = 0;
    */


    ///////////////////////////////////////////
    //Database / Shared Preferences Constants//
    ///////////////////////////////////////////

    public static final String DB_NAME = "CaliforniaPrototype.db";
    public static final boolean DELETE_DB_IF_NEEDED = true;
    public static final int DB_VERSION = 1;
    public static final String SHARED_PREFS_NAME = "CaliforniaPrototype";

    public static final String LOCATION_LATITUDE = "location_latitude";
    public static final String LOCATION_LONGITUDE = "location_longitude";
    public static final String LOCATION_LAST_TIME_SET = "location_last_time_set";


    /////////////////////////////////////////////////////////////////
    /////Custom Tags (There is no specific order to these numbers)///
    /////////////////////////////////////////////////////////////////

    //Request codes used for permission requests
    public static final int TAG_PERMISSIONS_ACCESS_NETWORK_STATE = 4398;
    public static final int MY_PERMISSIONS_REQUEST_CONTACTS = 4399;
    public static final int TAG_PERMISSIONS_REQUEST_BASE_CALL = 4400;
    public static final int TAG_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 4401;
    public static final int TAG_PERMISSIONS_REQUEST_CAMERA = 4402;
    public static final int TAG_PERMISSIONS_REQUEST_ALL = 4403;
    public static final int TAG_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 4404;
    public static final int TAG_PERMISSIONS_REQUEST_READ_PHONE_STATE = 4405;
    public static final int TAG_PERMISSIONS_REQUEST_CONTACTS = 4406;
    public static final int TAG_PERMISSIONS_ACCESS_WIFI_STATE = 4407;
    public static final int TAG_PERMISSIONS_ACCESS_FINE_LOCATION = 4408;
    public static final int TAG_PERMISSIONS_ACCESS_COARSE_LOCATION = 4409;
    public static final int TAG_PERMISSIONS_RECEIVE_BOOT_COMPLETED = 4410;
    public static final int TAG_PERMISSIONS_SYSTEM_ALERT_WINDOW = 4411;
    public static final int TAG_CONNECTIVITY_ISSUE = 4412;
    public static final int TAG_API_CALL_FAILURE = 4413;
    public static final int TAG_CA_USER = 4414;
    public static final int TAG_CA_LOCATION = 4415;
    public static final int TAG_EMPTY_OBJECT = 4416;
    public static final int TAG_API_ERROR = 4417;




    //API Call Tags
    public static final int TAG_API_LOCATION_ADDED = 4412;

    //File Creation Tags
    public static final int TAG_TXT_FILE_CREATION = 4404;

    //Date Formatting Tags, used for comparison and formatting
    public static final int DATE_MM_DD_YYYY = 4405;
    public static final int DATE_MM_DD_YY = 4406;
    public static final int DATE_YYYY_MM_DD = 4407;
    public static final int DATE_MM_DD = 4408;
    public static final int DATE_MM_YY = 4409;
    public static final int DATE_MM_YYYY = 4410;
    public static final int DATE_MILLISECONDS = 4411;
    public static final int DATE_EPOCH = 4412;
    public static final int DATE_MM_DD_YYYY_HH_MM = 4413;

    //More Misc Tags
    public static final int TAG_OAUTH_DATA_OBJECT = 4414;
    public static final int TAG_OAUTH_ERROR = 4415;
    public static final int TAG_PHOTO_BAD_URL = 4416;
    public static final int TAG_FILE_DOWNLOADED = 4417;
    public static final int TAG_DIALOG_POPUP_YES = 4418;
    public static final int TAG_DIALOG_POPUP_NO = 4419;
    public static final int TAG_DIALOG_POPUP_CANCEL = 4420;
    public static final int TAG_PHONE_QUERY_REGEX_FAIL = 4421;
    public static final int TAG_PHONE_QUERY_REGEX_SUCCESS = 4422;
    public static final int TAG_CONTACT_QUERY_EMAIL = 4423;
    public static final int TAG_CONTACT_QUERY_PHONE = 4424;
    public static final int TAG_CONTACT_QUERY_ADDRESS = 4425;
    public static final int TAG_CONTACT_QUERY_NAME = 4426;
    public static final int TAG_TAKE_PICTURE_WITH_CAMERA = 4427;
    public static final int TAG_PHOTO_FROM_GALLERY = 4428;
    public static final int TAG_CROP_PHOTO = 4429;
    public static final int TAG_RETURN_IMAGE_URL = 4430;
    public static final int TAG_TAKE_VIDEO_WITH_RECORDER = 4431;
    public static final int TAG_MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 4432;
    public static final int TAG_MY_PERMISSIONS_REQUEST_CAMERA = 4433;
    public static final int TAG_PHOTO_UNKNOWN_ERROR = 4434;
    public static final int TAG_CROP_ERROR = 4435;
    public static final int TAG_CROP_SUCCESS = 4436;
    public static final int TAG_PHOTO_CANCEL = 4437;
    public static final int TAG_UPLOAD_ERROR = 4438;
    public static final int TAG_UPLOAD_SUCCESS = 4439;
    public static final int TAG_CLICK_NO_TAG_SENT = 4440;
    public static final int TAG_LONG_CLICK_NO_TAG_SENT = 4441;
    public static final int TAG_RETROFIT_CALL_FAILED = 4442;
    public static final int TAG_RETROFIT_CALL_SUCCESS_BOOLEAN = 4443;
    public static final int TAG_RETROFIT_CALL_SUCCESS_STRING = 4444;
    public static final int TAG_RETROFIT_CALL_SUCCESS_OBJECT = 4445;
    public static final int TAG_TAKE_SELF_PHOTO = 4446;
    public static final int TAG_TAKE_SELF_PHOTO_SUCCESS = 4447;
    public static final int TAG_TAKE_SELF_PHOTO_FAILURE = 4448;
    public static final int DATE_YYYY_MM_DD_T_HH_MM_SS_SSS_Z = 4449;
    public static final int DATE_YYYY_MM_DD_T_HH_MM_SS_Z = 4450;

    //String Tags
    public static final String TAG_SELF_PHOTO_URI = "tag_self_photo_uri";

    ////////////////////
    /////Shared Prefs //
    ////////////////////

    public static final String CURRENT_FRAGMENT = "current_fragment";
    public static final String AUTH_TOKEN = "auth_token";
    public static final String USER_ID = "user_id";
    public static final String USER_PHONE_NUMBER = "user_phone_number";
    public static final String USER_PW = "user_pw";
    public static final String USER_EMAIL = "user_email";

    ///////////////////
    /////Time Values //
    ///////////////////

    //Time values in milliseconds
    public static final long ONE_SECOND = (1000);
    public static final long ONE_MINUTE = (1000*60);
    public static final long ONE_HOUR = (1000*60*60);
    public static final long ONE_DAY = (1000*60*60*24);
    public static final long ONE_WEEK = (1000*60*60*24*7);
    public static final long ONE_MONTH = (1000*60*60*24*30);
    public static final long ONE_YEAR = (1000*60*60*24*365);
    public static final int PROGRESS_BAR_TIMEOUT = 5000;

    //Default Date Format
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String DEFAULT_DATE_FORMAT_WITHOUT_MILLISECONDS = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////Colors/////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    //Color Strings
    public static final String COLOR_TRANSPARENT = "#00000000";
    public static final String COLOR_WHITE = "#FFFFFF";
    public static final String COLOR_BLACK = "#000000";
    public static final String COLOR_YELLOW = "#FFFF00";
    public static final String COLOR_FUCHSIA = "#FF00FF";
    public static final String COLOR_RED = "#FF0000";
    public static final String COLOR_SILVER = "#C0C0C0";
    public static final String COLOR_GRAY = "#808080";
    public static final String COLOR_LIGHT_GRAY = "#D3D3D3";
    public static final String COLOR_DARK_GRAY = "#666666";
    public static final String COLOR_OLIVE = "#808000";
    public static final String COLOR_PURPLE = "#800080";
    public static final String COLOR_MAROON = "#800000";
    public static final String COLOR_AQUA = "#00FFFF";
    public static final String COLOR_LIME = "#00FF00";
    public static final String COLOR_TEAL = "#008080";
    public static final String COLOR_GREEN = "#008000";
    public static final String COLOR_PINK = "#FFC0CB";
    public static final String COLOR_BLUE = "#0000FF";
    public static final String COLOR_NAVY_BLUE = "#000080";

    //For the Semi transparent colors, the higher the number, the darker (less opaque) the color
    public static final String COLOR_SEMI_TRANSPARENT_1 = "#20111111";
    public static final String COLOR_SEMI_TRANSPARENT_2 = "#30111111";
    public static final String COLOR_SEMI_TRANSPARENT_3 = "#40111111";
    public static final String COLOR_SEMI_TRANSPARENT_4 = "#50111111";
    public static final String COLOR_SEMI_TRANSPARENT_5 = "#69111111";
    public static final String COLOR_SEMI_TRANSPARENT_6 = "#79111111";
    public static final String COLOR_SEMI_TRANSPARENT_7 = "#89111111";
    public static final String COLOR_SEMI_TRANSPARENT_8 = "#99111111";
    public static final String COLOR_SEMI_TRANSPARENT_9 = "#A9111111";

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////Regular Expressions////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    //Credit Card Regular Expressions
    public static final String REGEX_CREDIT_CARD_VISA = "^4[0-9]{12}(?:[0-9]{3})?$";
    public static final String REGEX_CREDIT_CARD_MASTERCARD = "^5[1-5][0-9]{14}$";
    public static final String REGEX_CREDIT_CARD_AMERICAN_EXPRESS = "^3[47][0-9]{13}$";
    public static final String REGEX_CREDIT_CARD_DINERS_CLUB = "^3(?:0[0-5]|[68][0-9])[0-9]{11}$";
    public static final String REGEX_CREDIT_CARD_DISCOVER = "^6(?:011|5[0-9]{2})[0-9]{12}$";
    public static final String REGEX_CREDIT_CARD_JCB = "^(?:2131|1800|35\\d{3})\\d{11}$";

    //Misc Regexs
    public static final String REGEX_WEB_URL_ENCODING = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    public static final String REGEX_PASSWORD_PATTERN = "^\\S*(?=\\S*[a-zA-Z])(?=\\S*[0-9])\\S*$";
    public static final String REGEX_INTEGER = "^[0-9]+$";
    public static final String REGEX_DECIMAL = "^[0-9]+(?:\\.[0-9]+)?$";
    public static final String REGEX_MONEY = "^[0-9]+(?:\\.[0-9]{0,2})?$";
    public static final String REGEX_MONEY_SIGNED = "^[-+]?[0-9]+(?:\\.[0-9]{0,2})?$";
    public static final String REGEX_PHONE = "^ *\\(?[0-9]{3,3}[-\\.\\)]? ?[0-9]{3,3}[-\\. ]?[0-9]{4,4} *$";
    public static final String REGEX_IPADDRESS = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";
    public static final String REGEX_COLOR = "^#[0-9a-fA-F]{6,6}$";
    public static final String REGEX_DATE = "^[0-9]{1,2}[-/][0-9]{1,2}[-/][0-9]{2,4}$";
    public static final String REGEX_EMAIL = "^\\s*[^@\\s]+@(?:[^@\\.\\s]+\\.[^@\\.\\s]+)+\\s*$";

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////Animation Constants and Tags///////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    //Animation Techniques (From the library com.daimajia.androidanimations:library:1.1.3@aar).
    //Prefix: In means it brings them into sight while out takes them out of sight
    public static final Techniques IN_ZOOM_UP = Techniques.ZoomInUp; //Fun one, opposite of ZoomOutDown, zooms it up and then in
    public static final Techniques OUT_ZOOM_DOWN = Techniques.ZoomOutDown; //Fun one, zooms away (back) and then down, useful for getting rid of things
    public static final Techniques IN_ROLL = Techniques.RollIn;//Fly in effect looks nice for new views popping in
    public static final Techniques IN_PULSE = Techniques.Pulse; //Pops the view front and back, good for a focuser
    public static final Techniques OUT_HINGE = Techniques.Hinge; //Looks like broken hinge on view and it falls off, fun looking
    public static final Techniques IN_RUBBERBAND = Techniques.RubberBand; //Good for a 'de-select' kind of effect
    public static final Techniques OUT_FLIP_Y = Techniques.FlipOutY; //Clean looking flip out on y Axis, good for deletion/ removal
    public static final Techniques IN_FLIP_X = Techniques.FlipInX;  //Clean flip look. Looks like it's rotating on the X axis in
    public static final Techniques OUT_FLIP_X = Techniques.FlipOutX; //Opposite of FlipInX, good for deletetion / removal
    public static final Techniques OUT_SLIDE = Techniques.SlideOutUp; //Using SlideOutUp in conjunction with SlideInUp would look kinda cool...
    public static final Techniques IN_RIGHT_SLIDE = Techniques.SlideInRight; //Using SlideOutUp in conjunction with SlideInUp would look kinda cool...
    public static final Techniques IN_LEFT_SLIDE = Techniques.SlideInLeft; //Using SlideOutUp in conjunction with SlideInUp would look kinda cool...
    public static final Techniques IN_SLIDE = Techniques.SlideInUp; //Using SlideOutUp in conjunction with SlideInUp would look kinda cool...
    public static final Techniques IN_FADE_DOWN = Techniques.FadeInDown; //Simple fade in and down animation
    public static final Techniques IN_FADE_UP = Techniques.FadeInUp; //Simple fade in and up animation
    public static final Techniques IN_DROP = Techniques.DropOut; //Looks cool, falls down from top and bounces
    public static final Techniques IN_TADA = Techniques.Tada; //Fun one, seems useful for focusing on a view
    public static final Techniques OUT_ROLL = Techniques.RollOut;
    public static final Techniques OUT_ZOOM = Techniques.ZoomOut;
    public static final Techniques IN_FLASH = Techniques.Flash; //Quick flash


    ////////
    //Misc//
    ////////

    public static final double DEFAULT_LATITUDE = 34.0522;
    public static final double DEFAULT_LONGITUDE = -117.7348;
    public static final float LOCATION_MINIMUM_DISTANCE =  8050f;
    public static final long LOCATION_TIME_PERIOD_GAP = (Constants.ONE_HOUR * 4);

}
