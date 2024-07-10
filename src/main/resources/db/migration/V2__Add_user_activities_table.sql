CREATE TABLE user_activities (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT,
    activity_type VARCHAR(50),
    details TEXT,
    timestamp TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id)
);