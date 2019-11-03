
    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `configuration_spam_words` 
       drop 
       foreign key `FK5lk29cpqe3960a943x8x8j4yh`;

    alter table `consumer` 
       drop 
       foreign key FK_6cyha9f1wpj0dpbxrrjddrqed;

    alter table `provider` 
       drop 
       foreign key FK_b1gwnjqm6ggy9yuiqm0o4rlmd;

    drop table if exists `administrator`;

    drop table if exists `announcement`;

    drop table if exists `anonymous`;

    drop table if exists `authenticated`;

    drop table if exists `challenge`;

    drop table if exists `companyrecord`;

    drop table if exists `configuration`;

    drop table if exists `configuration_spam_words`;

    drop table if exists `consumer`;

    drop table if exists `investorsrecords`;

    drop table if exists `offers`;

    drop table if exists `provider`;

    drop table if exists `request`;

    drop table if exists `user_account`;

    drop table if exists `hibernate_sequence`;
